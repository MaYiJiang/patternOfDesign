package com.tang.principle.Decorator;

/** ClassName:CoffeeBar Package:com.tang.principle.Decorator @Date:2021/10/22 15:18 @Author:TYH */
public class CoffeeBar {
    public static void main(String[] args) {
        Drink drink = new Decaf();
        System.out.println(drink.cost());
        System.out.println("----");
        Drink order = new Milk(drink);
        System.out.println(order.getDescription() + "费用为:" + order.cost());
        System.out.println("----");
        order = new Milk(order);
        System.out.println(order.getDescription() + "费用为:" + order.cost());
    }
}
