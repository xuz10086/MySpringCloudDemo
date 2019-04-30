package com.xuz.controller;

import com.xuz.db1.pojo.User;
import com.xuz.db1.service.DB1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {

    @Autowired
    private DB1Service db1Service;

    @RequestMapping("/insert")
    public String insertDB(User user) {
        db1Service.insertDB(user);
        return "success";
    }
}
