package com.fitness.webapp.dao;

import java.sql.*;
import javafx.util.Pair;
import com.fitness.webapp.model.IdsPair;
import com.fitness.webapp.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository("mysql")
public class Account extends AccountDAO<Login> {
    private final JdbcTemplate jdbcTemplate;
    private static final Pbkdf2PasswordEncoder encoder = new Pbkdf2PasswordEncoder();

    @Autowired
    public Account(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insertUser(Login IdKeys) throws AccException {
        try {
            getUserNumberId(IdKeys);
        } catch (AccException e) {
            jdbcTemplate.update("INSERT INTO users (user_name, pass) VALUES (?,?)",
                    IdKeys.getLogin(), encoder.encode(IdKeys.getPassword()));
            jdbcTemplate.update("INSERT INTO extended_users (name, surname, fathers_name, is_sub) VALUES (?,?,?,?)",
                    IdKeys.getName(), IdKeys.getSurname(), IdKeys.getFathersName(), IdKeys.getIsSub() ? 1 : 0);
            return;
        }

        throw new AccException("such user already exists");
    }

    @Override
    public <T> int getUserNumberId(T IdKeys) throws AccException {
        String tmp;
        if (IdKeys instanceof String) {
            tmp = (String)IdKeys;
        } else if (IdKeys instanceof IdsPair) {
            tmp = ((IdsPair) IdKeys).getLogin();
        } else if (IdKeys instanceof Login) {
            tmp = ((Login) IdKeys).getLogin();
        } else {
            throw new AccException("invalid arguments type");
        }

        return jdbcTemplate.query("SELECT * FROM users WHERE user_name=?", new ResultSetExtractor<Integer>() {
            @Override
            public Integer extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                if (resultSet.next()) {
                    return resultSet.getInt(1);
                } else {
                    throw new AccException("such user doesn't exist");
                }
            }
        }, tmp);
    }

    @Override
    public Integer validateUser(IdsPair idsPair) throws AccException {
        Pair<String, Integer> hash = jdbcTemplate.query("SELECT * FROM users WHERE user_name=?",
                                                        new ResultSetExtractor<Pair<String, Integer>>() {
            @Override
            public Pair<String, Integer> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                if (resultSet.next()) {
                    return new Pair<String, Integer>(resultSet.getString(3), resultSet.getInt(1));
                } else {
                    throw new AccException("such user doesn't exist");
                }
            }
        }, idsPair.getLogin());
        if (encoder.matches(idsPair.getPassword(), hash.getKey())) {
            return hash.getValue();
        }
        return -1;
    }

    public IdsPair getLogin(int id) throws AccException {
        return jdbcTemplate.query("SELECT * FROM users WHERE id=?", new ResultSetExtractor<IdsPair>() {
            @Override
            public IdsPair extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                if (resultSet.next()) {
                    return new IdsPair(resultSet.getString(2), resultSet.getString(3));
                } else {
                    throw new AccException("such user doesn't exist");
                }
            }
        });
    }

    @Override
    public void updatePassword(IdsPair IdKeys) throws AccException {
        getUserNumberId(IdKeys);
        jdbcTemplate.update("UPDATE users SET pass=? WHERE user_name=?",
                            encoder.encode(IdKeys.getPassword()), IdKeys.getLogin());
    }
}
