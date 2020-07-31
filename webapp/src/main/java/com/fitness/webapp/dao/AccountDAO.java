package com.fitness.webapp.dao;

import com.fitness.webapp.model.IdsPair;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public abstract class AccountDAO<ID> {
    public abstract void insertUser(ID IdKeys) throws AccException;

    public abstract <T> int getUserNumberId(T IdKeys) throws AccException;

    public abstract Integer validateUser(IdsPair idsPair) throws AccException;

    public abstract void updatePassword(IdsPair IdKeys) throws AccException;
}
