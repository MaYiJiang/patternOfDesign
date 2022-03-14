package com.tang.principle.absFactory.test;

import com.tang.principle.absFactory.order.OrederPizza;
import com.tang.principle.absFactory.orderFactory.NYStore;

/** ClassName:Test1 Package:com.tang.principle.absFactory.test @Date:2021/10/18 17:03 @Author:TYH */
public class Test1 {
    public static void main(String[] args) {
        new OrederPizza(new NYStore());
    }
}
