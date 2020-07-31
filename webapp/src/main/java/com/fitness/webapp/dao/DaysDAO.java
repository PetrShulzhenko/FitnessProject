package com.fitness.webapp.dao;

import com.fitness.webapp.model.Day;

import java.util.List;

public abstract class DaysDAO {
    public abstract List<String> getAllDays(Integer id) throws DaysException;

    public abstract void addDay(String date, String exercises, Integer id) throws DaysException;

    public abstract void removeDay(String date, Integer id) throws DaysException;
}
