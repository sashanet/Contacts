package com.olya.contacts.repository;


import com.olya.contacts.domain.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<User, String> {
    User findByEmail(String email);
    List<User> findAll();
}
