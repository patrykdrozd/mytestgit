package com.patryk.service;

import com.patryk.model.User;

import java.util.List;

public interface UserService {
    void create(User u);
    List<User> getAll();
    List<User> getByName(String name);
}
