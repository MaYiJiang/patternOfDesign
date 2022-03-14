package com.tang.principle.strategyPattern.context;

import com.tang.principle.strategyPattern.strategy.Dicount;

/**
 * ClassName:MovieTicket Package:com.tang.principle.strategyPattern.context @Date:2021/10/31
 * 8:56 @Author:TYH
 */
public class MovieTicket {
    private Dicount dicount;
    private double price;

    public double getPrice() {
        if (dicount != null) {
            this.price = this.dicount.calculate(this.price);
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Dicount getDicount() {
        return dicount;
    }

    public void setDicount(Dicount dicount) {
        this.dicount = dicount;
    }
}
