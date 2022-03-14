package com.tang.principle.absFactory.order;

import com.tang.principle.absFactory.orderFactory.AbsFactory;
import com.tang.principle.absFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ClassName:OrederPizza Package:com.tang.principle.absFactory.order @Date:2021/10/18
 * 16:54 @Author:TYH
 */
public class OrederPizza {
    public OrederPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        String pizza;
        Pizza orderPizza;
        do {
            pizza = getType();
            orderPizza = factory.createPizza(pizza);
            if (orderPizza != null) {
                orderPizza.prepare();
                orderPizza.bake();
                orderPizza.cut();
                orderPizza.box();
            } else {
                System.out.println("订购取消");
                break;
            }
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
