package com.atguigu.springboot.test;

import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
    @Autowired
    UserService userService;

    @Autowired
    DataSource dataSource;

    /*
       SpringBoot框架默认集成数据源HikariDataSource
     * HikariDataSource 默认数据源，性能很高，稳定性不如Druid
     * DruidDataSource 使用很高，很稳定
     */
    @Test
    public void test2() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void test01() {
        List<User> list = userService.findAll();
        for (User user : list) {
            System.out.println("user = " + user);
        }
    }
}

