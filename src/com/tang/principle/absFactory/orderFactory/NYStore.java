package com.tang.principle.absFactory.orderFactory;

import com.tang.principle.absFactory.pizza.NYCheessPiza;
import com.tang.principle.absFactory.pizza.NYGreekPizza;
import com.tang.principle.absFactory.pizza.Pizza;

/**
 * ClassName:NYStore Package:com.tang.principle.absFactory.orderFactory @Date:2021/10/18
 * 16:51 @Author:TYH
 */
public class NYStore implements AbsFactory {
    Pizza pizza = null;

    @Override
    public Pizza createPizza(String typeOfPizza) {
        if ("cheess".equals(typeOfPizza)) {
            pizza = new NYCheessPiza();
            pizza.setPizzaName("纽约店的奶酪披萨");
        } else if ("greek".equals(typeOfPizza)) {
            pizza = new NYGreekPizza();
            pizza.setPizzaName("纽约店的希腊披萨");
        } else {
            return null;
        }
        return pizza;
    }
}
