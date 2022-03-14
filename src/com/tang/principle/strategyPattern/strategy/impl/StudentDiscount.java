package com.tang.principle.strategyPattern.strategy.impl;

import com.tang.principle.strategyPattern.strategy.Dicount;

/**
 * ClassName:StudentDiscount
 * Package:com.tang.principle.strategyPattern.strategy.impl @Date:2021/10/31 8:56 @Author:TYH
 */
public class StudentDiscount implements Dicount {
    @Override
    public double calculate(double price) {
        return price * 0.8;
    }
}
