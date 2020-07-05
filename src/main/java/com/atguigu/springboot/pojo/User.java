package com.atguigu.springboot.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author lizhiwei
 * @create 2020-07-02-19:43
 */
@Component
@ConfigurationProperties(prefix = "user")
public class User implements Serializable {

    private Integer id;
    private String uname;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(Integer id, String uname, Integer age) {
        this.id = id;
        this.uname = uname;
        this.age = age;
    }

    public User() {
    }
}
