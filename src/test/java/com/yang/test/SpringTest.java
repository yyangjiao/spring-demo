package com.yang.test;

import com.alibaba.druid.pool.DruidDataSource;

import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTest {
    @Autowired
    private DruidDataSource druidDataSource;

    @Test
    public void druidTest() throws SQLException {
        DruidPooledConnection connection = druidDataSource.getConnection();
        System.out.println(connection);
    }
}
