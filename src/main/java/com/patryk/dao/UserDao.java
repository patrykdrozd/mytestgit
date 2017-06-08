package com.patryk.dao;

import com.patryk.model.User;

import java.util.List;

public interface UserDao {
    void create(User u);
    List<User> getAll();
    List<User> getByName(String name);
}
