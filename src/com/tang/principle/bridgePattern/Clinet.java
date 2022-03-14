package com.tang.principle.bridgePattern;

/** ClassName:Clinet Package:com.tang.principle.bridgePattern @Date:2021/10/22 10:23 @Author:TYH */
public class Clinet {
    public static void main(String[] args) {
        Computer deskTop = new DeskTop(new Apple());
        deskTop.start();
    }
}
