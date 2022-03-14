package com.tang.principle.mementoPattern;

/** ClassName:Client Package:com.tang.principle.mementoPattern @Date:2021/10/29 16:07 @Author:TYH */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("状态1");
        originator.setState("状态2");
        originator.setState("状态3");
        originator.setState("状态4");
        System.out.println(originator.careTaker.getIndexOfState(3));
    }
}
