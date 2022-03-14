package com.tang.principle.absFactory.orderFactory;

import com.tang.principle.absFactory.pizza.BJCheessPizza;
import com.tang.principle.absFactory.pizza.BJGreekPizza;
import com.tang.principle.absFactory.pizza.Pizza;

/**
 * ClassName:BJStore Package:com.tang.principle.absFactory.orderFactory @Date:2021/10/18
 * 16:47 @Author:TYH
 */
public class BJStore implements AbsFactory {
    Pizza pizza = null;

    @Override
    public Pizza createPizza(String typeOfPizza) {
        if ("cheess".equals(typeOfPizza)) {
            pizza = new BJCheessPizza();
            pizza.setPizzaName("北京店的奶酪披萨");
        } else if ("greek".equals(typeOfPizza)) {
            pizza = new BJGreekPizza();
            pizza.setPizzaName("北京店的希腊披萨");
        } else {
            return null;
        }
        return pizza;
    }
}
