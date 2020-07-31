package com.fitness.webapp.dao;

import org.springframework.dao.DataAccessException;

public class DaysException extends DataAccessException {
    public DaysException(String message) {
        super(message);
    }
}
