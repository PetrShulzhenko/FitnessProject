package com.fitness.webapp.services;

import com.fitness.webapp.dao.CouchsSubsDAO;
import com.fitness.webapp.dao.DaysDAO;
import com.fitness.webapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouchService {
    private final CouchsSubsDAO couchsSubsDao;
    private final DaysDAO daysDao;

    @Autowired
    public CouchService(CouchsSubsDAO couchsSubsDao, DaysDAO daysDao) {
        this.couchsSubsDao = couchsSubsDao;
        this.daysDao = daysDao;
    }

    public List<User> getAllSubs() {
        return couchsSubsDao.getAllSubs();
    }

    public List<String> getAllDays(Integer id) {
        return daysDao.getAllDays(id);
    }

    public void addDay(String date, String exercises, Integer id) {
        daysDao.addDay(date, exercises, id);
    }

    public void removeDay(String date, Integer id) {
        daysDao.removeDay(date, id);
    }
}
