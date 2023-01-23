package com.yang.service;

import com.yang.dao.UserDao;
import com.yang.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    public UserService() {
    }

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public List<User> selectAll() {
        return userDao.selectAll();
    }
}
