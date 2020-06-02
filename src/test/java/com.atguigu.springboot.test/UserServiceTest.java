package com.atguigu.springboot.test;

import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.mapper.UserJpaMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserJpaMapper userJpaMapper;

    @Test
    public void findUsers() {
        List<User> list = userJpaMapper.findAll();
        System.out.println(list);
    }

    @Test
    public void findUserById() {
    }

    @Test
    public void saveUser() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void deleteUserById() {
    }
}