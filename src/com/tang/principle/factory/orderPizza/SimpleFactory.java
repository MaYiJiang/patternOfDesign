package com.tang.principle.factory.orderPizza;

import com.tang.principle.factory.pizza.CheessPizza;
import com.tang.principle.factory.pizza.ChinaPizza;
import com.tang.principle.factory.pizza.GreekPizza;
import com.tang.principle.factory.pizza.Pizza;

/**
 * ClassName:SimpleFactory Package:com.tang.principle.factory.pizza.orderPizza @Date:2021/10/18
 * 14:20 @Author:TYH
 */
public class SimpleFactory {
    public static Pizza createPizza(String typeOfPizza) {
        Pizza pizza = null;
        if ("greek".equals(typeOfPizza)) {
            pizza = new GreekPizza();
            pizza.setPizzaName("greekPizza");
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else if ("cheess".equals(typeOfPizza)) {
            pizza = new CheessPizza();
            pizza.setPizzaName("cheessPizza");
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else if ("china".equals(typeOfPizza)) {
            pizza = new ChinaPizza();
            pizza.setPizzaName("chinPizza");
            pizza.prepare();
            System.out.println("Loading......");
        } else {
            System.out.println("订购失败!!");
        }
        return pizza;
    }
}
