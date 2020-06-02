package com.atguigu.springboot.service.impl;

import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.mapper.UserJpaMapper;
import com.atguigu.springboot.mapper.UserMapper;
import com.atguigu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    UserJpaMapper userJpaMapper;

    @Transactional
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    /**
     * 查询所有
     */
    @Override
    public List<User> findUsers() {
        return userJpaMapper.findAll();
    }

    /**
     * 根据id查询
     */
    @Override
    public User findUserById(Integer id) {
        return userJpaMapper.findById(id).get();
    }
    /**
     * 保存
     */
    @Override
    public void saveUser(User user) {
        userJpaMapper.save(user);
    }
    /**
     * 更新
     */
    @Override
    public void updateUser(User user) {
        userJpaMapper.save(user);
    }
    /**
     * 根据id删除
     */
    @Override
    public void deleteUserById(Integer id) {
        userJpaMapper.deleteById(id);
    }

}

