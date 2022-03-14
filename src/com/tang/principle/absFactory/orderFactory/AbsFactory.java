package com.tang.principle.absFactory.orderFactory;

import com.tang.principle.absFactory.pizza.Pizza;

/**
 * ClassName:AbsFactory Package:com.tang.principle.absFactory.orderFactory @Date:2021/10/18
 * 16:41 @Author:TYH
 */
public interface AbsFactory {
    Pizza createPizza(String typeOfPizza);
}
