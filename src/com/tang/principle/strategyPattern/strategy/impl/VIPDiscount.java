package com.tang.principle.strategyPattern.strategy.impl;

import com.tang.principle.strategyPattern.strategy.Dicount;

/**
 * ClassName:VIPDiscount Package:com.tang.principle.strategyPattern.strategy.impl @Date:2021/10/31
 * 8:57 @Author:TYH
 */
public class VIPDiscount implements Dicount {
    @Override
    public double calculate(double price) {
        return price * 0.5;
    }
}
