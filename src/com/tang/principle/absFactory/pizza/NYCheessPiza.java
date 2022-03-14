package com.tang.principle.absFactory.pizza;

/**
 * ClassName:NYCheessPiza Package:com.tang.principle.absFactory.pizza @Date:2021/10/18
 * 16:45 @Author:TYH
 */
public class NYCheessPiza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(pizzaName + "原材料不够");
    }
}
