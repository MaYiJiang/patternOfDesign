package com.tang.principle.template;

/** ClassName:Client Package:com.tang.principle.template @Date:2021/10/26 18:22 @Author:TYH */
public class Client {
    public static void main(String[] args) {
        Cooking dish1 = new Bouilli();
        Cooking dish2 = new EggsWithTomato();
        dish1.cooking();
        System.out.println("----");
        dish2.cooking();
    }
}
