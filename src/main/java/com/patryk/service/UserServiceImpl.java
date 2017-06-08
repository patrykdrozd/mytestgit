package com.patryk.service;

import com.patryk.dao.UserDao;
import com.patryk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void create(User u) {
        userDao.create(u);
    }

    public List<User> getAll() {
        return userDao.getAll();
    }

    public List<User> getByName(String name) {
        return userDao.getByName(name);
    }
}
