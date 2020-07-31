package com.fitness.webapp.controllers;

import com.fitness.webapp.model.User;
import com.fitness.webapp.services.CouchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/couch")
public class CouchController {
    private final CouchService couchService;

    @Autowired
    public CouchController(CouchService couchService) {
        this.couchService = couchService;
    }

    @PostMapping("/get_all_subs")
    public List<User> getAllSubs() {
        return couchService.getAllSubs();
    }

    @GetMapping(path = "{id}")
    public List<String> getAllDays(@PathVariable("id") Integer id) {
        return couchService.getAllDays(id);
    }

    @PutMapping(path = "{id}")
    public void insertDay(@PathVariable("id") Integer id, String date, String exercises) {
        couchService.addDay(date, exercises, id);
    }

    @DeleteMapping(path = "{id}")
    public void removeDay(@PathVariable("id") Integer id, String date) {
        couchService.removeDay(date, id);
    }
}
