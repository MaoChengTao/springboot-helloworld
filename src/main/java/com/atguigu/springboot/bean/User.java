package com.atguigu.springboot.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user2")
public class User implements Serializable {

    @Id //声明当前字段是主键字段
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GenerationType.IDENTITY相当与表的auto_increment
    private Integer id;

    @Column(name = "username")
    private String username;

    //@Column(name = "password")  //省略不设置，表的字段名称与实体类的属性的名称一致。
    private String password;

    @Column(name="name")
    private String name;

    public User() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
