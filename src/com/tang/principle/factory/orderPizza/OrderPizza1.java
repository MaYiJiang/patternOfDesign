package com.tang.principle.factory.orderPizza;

import com.tang.principle.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ClassName:OrderPizza1 Package:com.tang.principle.factory.orderPizza @Date:2021/10/18
 * 14:21 @Author:TYH
 */
public class OrderPizza1 {
    String typeOfPizza;
    Pizza pizza;

    public OrderPizza1() {
        do {
            typeOfPizza = getType();
            pizza = SimpleFactory.createPizza(typeOfPizza);
            if (pizza == null) break;
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
