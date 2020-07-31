package com.fitness.webapp.dao;

import com.fitness.webapp.model.Day;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


// todo : form the structure of the table & rename SQL table
@Repository
public class Days extends DaysDAO {
    JdbcTemplate jdbcTemplate;

    @Autowired
    public Days(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // todo: override method after agreement on week information

    @Override
    public void removeDay(String date, Integer id) throws DaysException {
        return;
    }

//    public ArrayList<ClientsStatus> getAllClients() throws DaysException {
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery((new StringBuilder()
//                    .append("select * from ")
//                    .append(couch)
//                    .append("_clients").toString()));
//            statement.close();
//            ArrayList<ClientsStatus> array = new ArrayList<>();
//            while (resultSet.next()) {
//                array.add(new ClientsStatus(resultSet.getString(1), resultSet.getInt(2)));
//            }
//            return array;
//        } catch (SQLException e) {
//            throw new DaysException(e.getMessage());
//        }
//    }

    public String getDay(String date, Integer id) throws DaysException {
        return jdbcTemplate.query("SELECT * FROM testing WHERE day=?", new ResultSetExtractor<String>() {
            @Override
            public String extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                if (resultSet.next()) {
                    return resultSet.getString(2);
                } else {
                    throw new DaysException("incorrect day: " + date);
                }
            }
        });
    }

    // TODO: use id
    @Override
    public void addDay(String date, String exercises, Integer id) {
        jdbcTemplate.update("INSERT INTO testing (day, exercises) VALUES (?,?)", date, exercises);
    }

//    public String getDay(String date, String login) throws DaysException {
//        return getDay(date, getIntegerId(login));
//    }
//
//    public List<String> getAllDays(String login) throws DaysException {
//        return getAllDays(getIntegerId(login));
//    }

    @Override
    public List<String> getAllDays(Integer id) throws DaysException {
        return jdbcTemplate.query("SELECT * FROM testing WHERE id=?", new ResultSetExtractor<List<String>>() {
            @Override
            public List<String> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                ArrayList<String> result = new ArrayList<>();
                while (resultSet.next()) {
                    result.add(resultSet.getString(2));
                }
                return result;
            }
        }, id);
    }

//    public int getIntegerId(String login) throws DaysException {
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(new StringBuilder()
//                    .append("select * from ")
//                    .append(couch)
//                    .append("_clients where client=?").toString());
//            preparedStatement.setString(1, login);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            preparedStatement.close();
//            if (resultSet.next()) {
//                return resultSet.getInt(1) - 1;
//            }
//            else {
//                throw new DaysException("user with such login doesn't exist");
//            }
//        } catch (SQLException e) {
//            throw new DaysException(e.getMessage());
//        }
//    }

//    public void createTable(Integer id) throws DaysException {             // structure of the table
//        try {
//            Statement statement = connection.createStatement();
//            statement.execute(new StringBuilder().append("create table if not exists ")
//                                                 .append(couch)
//                                                 .append("_days_")
//                                                 .append(id)
//                                                 .append(" (day date, exercises varchar(500), primary key (day))").toString());
//            statement.close();
//        } catch (SQLException e) {
//            throw new DaysException(e.getMessage());
//        }
//    }
//
//    public void createTable() throws DaysException {
//        try {
//            Statement statement = connection.createStatement();
//            statement.execute(new StringBuilder().append("create table if not exists ")
//                    .append(couch)
//                    .append("_clients (id int auto_increment, client varchar(20), status int, primary key (client))").toString());
//            statement.close();
//        } catch (SQLException e) {
//            throw new DaysException(e.getMessage());
//        }
//    }
}
