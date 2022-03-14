package com.tang.principle.visitorDesign.user.impl;

import com.tang.principle.visitorDesign.user.User;
import com.tang.principle.visitorDesign.visitor.Visitor;

import java.math.BigDecimal;

/**
 * ClassName:Teacher Package:com.tang.principle.visitorDesign.user.impl @Date:2021/10/27
 * 18:36 @Author:TYH
 */
public class Teacher extends User {

    public Teacher(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // 升本率
    public double entranceRatio() {
        return BigDecimal.valueOf(Math.random() * 100)
                .setScale(2, BigDecimal.ROUND_HALF_UP)
                .doubleValue();
    }
}
