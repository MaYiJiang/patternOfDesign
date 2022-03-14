package com.tang.principle.factory.pizza;

/**
 * ClassName:CheessPizza Package:com.tang.principle.factory.pizza @Date:2021/10/18 14:20 @Author:TYH
 */
public class CheessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(pizzaName + "原材料准备");
    }
}
