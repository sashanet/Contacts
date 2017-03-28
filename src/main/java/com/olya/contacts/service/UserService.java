package com.olya.contacts.service;


import com.olya.contacts.domain.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService extends UserDetailsService{

        List<User> getAllUsers();
}
