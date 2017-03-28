package com.olya.contacts.service;


import com.olya.contacts.domain.entity.User;

public interface AuthenticationService {
    void authenticate(User user);
    void logout();
}
