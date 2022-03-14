package com.tang.principle.observer.test;

import com.tang.principle.observer.User;
import com.tang.principle.observer.WechatServer;

/**
 * ClassName:TestObserver Package:com.tang.principle.observer.test @Date:2021/10/28
 * 18:07 @Author:TYH
 */
public class TestObserver {
    public static void main(String[] args) {
        WechatServer wechatServer = new WechatServer();
        User user1 = new User("张三");
        User user2 = new User("李四");
        User user3 = new User("王五");
        wechatServer.addObserver(user1);
        wechatServer.addObserver(user2);
        wechatServer.addObserver(user3);
        System.out.println("发送空(默认)信息");
        wechatServer.notifyObservers();
        System.out.println("---");
        wechatServer.updateMessa("新消息!!");
    }
}
