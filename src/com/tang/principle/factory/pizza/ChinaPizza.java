package com.tang.principle.factory.pizza;

/**
 * ClassName:ChinaPizza Package:com.tang.principle.factory.pizza @Date:2021/10/18 14:49 @Author:TYH
 */
public class ChinaPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("ChinaPizza is transporting from china Please wait !");
    }
}
