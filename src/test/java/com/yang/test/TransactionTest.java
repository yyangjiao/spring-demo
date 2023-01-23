package com.yang.test;

import com.yang.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TransactionTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void transferTest(){
        String nameOut = "张三";
        String nameIn = "李四";
        accountService.transfer(nameOut,nameIn,500);
    }
}
