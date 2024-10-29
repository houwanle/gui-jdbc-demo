package com.lele.java.domain;

/**
 * @author: lele
 * @date: 2024/10/29 08:45
 * @description:
 */

public class User {
    private int id;
    private String username;
    private String pwd;
    private int age;
    private String address;

    public User() {
        super();
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
