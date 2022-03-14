package com.tang.principle.fltWeight;

/** ClassName:User Package:com.tang.principle.fltWeight @Date:2021/10/24 16:22 @Author:TYH */
public class User {
    String userName;
    Integer id;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User(String userName, Integer id) {
        this.userName = userName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "登录账号...  用户名:" + userName + "         id:" + id + '}';
    }
}
