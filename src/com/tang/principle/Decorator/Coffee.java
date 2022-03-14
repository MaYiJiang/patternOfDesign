package com.tang.principle.Decorator;

/** ClassName:Coffee Package:com.tang.principle.Decorator @Date:2021/10/22 15:13 @Author:TYH */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getCost();
    }
}
