package com.yang.dao;

public interface AccountDao {
    void in(String name,double money);
    void out(String name,double money);
}
