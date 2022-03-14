package com.tang.principle.Decorator;

/** ClassName:Decorator Package:com.tang.principle.Decorator @Date:2021/10/22 15:20 @Author:TYH */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getCost() + drink.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "调味料&&" + drink.getDescription();
    }
}
