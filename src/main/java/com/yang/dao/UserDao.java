package com.yang.dao;

import com.yang.domain.User;

import java.util.List;

public interface UserDao {
    List<User> selectAll();
}
