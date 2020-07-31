package com.fitness.webapp.dao;

import com.fitness.webapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CouchsSubs extends CouchsSubsDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CouchsSubs(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> getAllSubs() {
        return jdbcTemplate.query("SELECT * FROM users_of_couch", new ResultSetExtractor<List<User>>() {
            @Override
            public List<User> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                ArrayList<User> result = new ArrayList<User>();
                while (resultSet.next()) {
                    result.add(new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
                                        resultSet.getBoolean(4), resultSet.getBoolean(5), resultSet.getShort(6),
                                        resultSet.getShort(7), resultSet.getShort(8), resultSet.getString(9),
                                        resultSet.getString(10), resultSet.getString(11), resultSet.getString(12),
                                        resultSet.getString(13), resultSet.getString(14), resultSet.getString(15),
                                        resultSet.getString(16), resultSet.getString(17)));
                }
                return result;
            }
        });
    }
}
