package com.olya.contacts.controller;

import com.olya.contacts.domain.AAAA;
import com.olya.contacts.domain.entity.User;
import com.olya.contacts.repository.UserRepository;
import com.olya.contacts.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;

@RestController
@Component
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostConstruct
    void init() {
        importData();
    }

    public void importData() {
        userRepository.save(createUser());
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView logout() {
        authenticationService.logout();
        return new ModelAndView("redirect:" + "/login.html");
    }

    private User createUser() {
        User user = new User();
        user.setEmail("sashanettm@gmail.com");
        user.setPassword(passwordEncoder.encode("ma37724"));
        user.setName("sasha");
        return user;
    }

}
