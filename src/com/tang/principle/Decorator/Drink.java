package com.tang.principle.Decorator;

/** ClassName:Drink Package:com.tang.principle.Decorator @Date:2021/10/22 15:11 @Author:TYH */
public abstract class Drink {
    private String description;
    private float cost;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public abstract float cost();
}
