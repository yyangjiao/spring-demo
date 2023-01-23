package com.yang.dao.impl;

import com.yang.dao.UserDao;
import com.yang.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl  implements UserDao {
//    private List<User> users;
//
//    public void setUsers(List<User> users) {
//        this.users = users;
//    }

    public List<User> selectAll() {
//        System.out.println(users);
        System.out.println("UserDaoImpl.selectAll...");
        return null;
    }
}
