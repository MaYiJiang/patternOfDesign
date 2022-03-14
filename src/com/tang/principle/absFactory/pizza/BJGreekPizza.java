package com.tang.principle.absFactory.pizza;

/**
 * ClassName:BJGreekPizza Package:com.tang.principle.absFactory.pizza @Date:2021/10/18
 * 16:44 @Author:TYH
 */
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(pizzaName + "准备原材料");
    }
}
