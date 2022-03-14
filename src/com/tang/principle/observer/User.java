package com.tang.principle.observer;

import java.util.Observable;
import java.util.Observer;

/** ClassName:User Package:com.tang.principle.observer @Date:2021/10/28 18:06 @Author:TYH */
public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        String msg = (String) arg;
        System.out.println(name + " 接收到了新的信息:" + arg);
    }
}
