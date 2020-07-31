package com.fitness.webapp.services;

import com.fitness.webapp.dao.AccException;
import com.fitness.webapp.dao.AccountDAO;
import com.fitness.webapp.dao.DaysDAO;
import com.fitness.webapp.model.IdsPair;
import com.fitness.webapp.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final AccountDAO<Login> accountDao;
    private final DaysDAO daysDao;

    @Autowired
    public UserService(@Qualifier("mysql") AccountDAO<Login> accountDao,
                       DaysDAO daysDao) {
        this.accountDao = accountDao;
        this.daysDao = daysDao;
    }

    public Integer validateUser(IdsPair idsPair) {
        try {
            return accountDao.validateUser(idsPair);
        } catch (AccException e) {
            return 0;
        }
    }

    public Boolean insertUser(Login login) {
        try {
            accountDao.insertUser(login);
            return true;
        } catch (AccException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean updatePassword(IdsPair idsPair) {
        try {
            accountDao.updatePassword(idsPair);
            return true;
        } catch (AccException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean doesExist(String login) {
        try {
            accountDao.getUserNumberId(login);
            return true;
        } catch (AccException e) {
            return false;
        }
    }

    public List<String> getAllDays(Integer id) {
        return daysDao.getAllDays(id);
    }
}
