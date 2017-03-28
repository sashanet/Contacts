package com.olya.contacts.service.Impl;


import com.olya.contacts.domain.entity.User;
import com.olya.contacts.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;


@Component
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public void authenticate(User user) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword());
        SecurityContextHolder.getContext().setAuthentication(authenticationManager.authenticate(token));
    }

    @Override
    public void logout() {
        SecurityContextHolder.getContext().getAuthentication().setAuthenticated(false);
    }
}
