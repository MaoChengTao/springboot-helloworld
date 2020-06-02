package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // 相当于异步请求处理，返回结果一般是Json数据
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findAll")
    public List<User> findAll(){
        System.out.println("userService.getClass() = " + userService.getClass());
        List<User> list = userService.findAll();
        System.out.println(list);
        return list;
    }

    @RequestMapping("/findUsers")
    public List<User> findUsers(){
        return userService.findUsers();
    }

    @RequestMapping("/findUserById/{id}")
    public User findUserById(@PathVariable("id") Integer id) {
        return userService.findUserById(id);
    }
    @RequestMapping("/saveUser")
    public void saveUser(User user) {
        userService.saveUser(user);
    }
    @RequestMapping("/updateUser")
    public void updateUser(User user) {
        userService.updateUser(user);
    }
    @RequestMapping("/deleteUserById/{id}")
    public void deleteUserById(@PathVariable("id")  Integer id) {
        userService.deleteUserById(id);
    }

}
