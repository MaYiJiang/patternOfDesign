package com.tang.principle.absFactory.pizza;

/**
 * ClassName:BJCheessPizza Package:com.tang.principle.absFactory.pizza @Date:2021/10/18
 * 16:42 @Author:TYH
 */
public class BJCheessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(pizzaName + "原材料准备");
    }
}
