package com.fitness.webapp.dao;

import org.springframework.dao.DataAccessException;

public class AccException extends DataAccessException {
    public AccException(String message) {
        super(message);
    }
}
