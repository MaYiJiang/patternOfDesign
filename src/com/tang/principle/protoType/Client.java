package com.tang.principle.protoType;

import java.util.Date;

/** ClassName:Client Package:com.tang.principle.protoType @Date:2021/10/19 16:58 @Author:TYH */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("多利", 3, new Date());
        System.out.println(sheep);
        System.out.println("---------");
        Sheep sheepCopy1 = (Sheep) sheep.clone();
        Sheep sheepCopy2 = (Sheep) sheep.clone();
        sheep.setBirthday(new Date(1254323));
        System.out.println(sheep);
        System.out.println(sheepCopy1);
        System.out.println(sheepCopy2);
        System.out.println("---------");
        Sheep sheepCopy3 = sheepCopy1.deepClone();
        sheepCopy3.setBirthday(new Date(3));
        System.out.println(sheepCopy3);
        System.out.println(sheepCopy2);
    }
}
