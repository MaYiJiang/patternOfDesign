package com.tang.principle.template;

/** ClassName:Bouilli Package:com.tang.principle.template @Date:2021/10/26 18:19 @Author:TYH */
public class Bouilli extends Cooking {
    @Override
    void carriedDish() {
        System.out.println("猪肉和土豆");
    }

    @Override
    void doing() {
        System.out.println("倒入锅中翻炒");
    }

    @Override
    void preparation() {
        System.out.println("做好端给客人吃");
    }
}
