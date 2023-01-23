package com.yang.dao.impl;

import com.yang.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    public void in(String name, double money) {
        String sql = "update tb_account set money=money+? where name=?";
        jdbcTemplate.update(sql,money,name);
    }

    public void out(String name, double money) {
        String sql = "update tb_account set money=money-? where name=?";
        jdbcTemplate.update(sql,money,name);
    }
}
