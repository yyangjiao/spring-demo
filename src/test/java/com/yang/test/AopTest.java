package com.yang.test;

import com.yang.aop.Target;
import com.yang.aop.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AopTest {
    @Autowired
    private TargetInterface target;

    @Test
    public void test(){
        target.func();
    }
}
