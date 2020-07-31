package com.fitness.webapp.dao;

import com.fitness.webapp.model.User;

import java.util.List;

public abstract class CouchsSubsDAO {
    public abstract List<User> getAllSubs();
}
