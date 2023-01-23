package com.yang.service.impl;

import com.yang.dao.AccountDao;
import com.yang.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

//    public void setAccountDao(AccountDao accountDao) {
//        this.accountDao = accountDao;
//    }

    public void transfer(String nameOut, String nameIn, double money) {
        accountDao.out(nameOut,money);
//        int i = 1/0;
        accountDao.in(nameIn,money);
    }
}
