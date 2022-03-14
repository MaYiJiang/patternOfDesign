package com.tang.principle.absFactory.pizza;

/** ClassName:Pizza Package:com.tang.principle.factory.pizza @Date:2021/10/18 14:19 @Author:TYH */
public abstract class Pizza {
    String pizzaName;

    public abstract void prepare();

    public void bake() {
        System.out.println(pizzaName + "烘焙");
    }

    public void cut() {
        System.out.println(pizzaName + "被切分");
    }

    public void box() {
        System.out.println(pizzaName + "被包装");
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }
}
