package com.olya.contacts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sasha on 26.03.2017.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model){
        model.addAttribute("name", "GUEST");
        return "greeting";
    }
}
