package com.olya.contacts.controller;

import com.olya.contacts.domain.entity.User;
import com.olya.contacts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sasha on 26.03.2017.
 */

@RestController
public class HomeController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/")
    public List<User> getUser(){
       return userService.getAllUsers();
    }

}
