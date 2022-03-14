package com.tang.principle.Decorator;

/** ClassName:Milk Package:com.tang.principle.Decorator @Date:2021/10/22 15:25 @Author:TYH */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setCost(1);
        setDescription("牛奶");
    }
}
