package com.tang.principle.factory.pizza;

/**
 * ClassName:GreekPizza Package:com.tang.principle.factory.pizza @Date:2021/10/18 14:21 @Author:TYH
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(pizzaName + "原材料准备");
    }
}
