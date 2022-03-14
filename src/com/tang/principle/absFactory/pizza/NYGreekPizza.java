package com.tang.principle.absFactory.pizza;

/**
 * ClassName:NYGreekPizza Package:com.tang.principle.absFactory.pizza @Date:2021/10/18
 * 16:46 @Author:TYH
 */
public class NYGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(pizzaName + "原材料短缺");
    }
}
