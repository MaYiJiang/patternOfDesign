package com.tang.principle.visitorDesign.user.impl;

import com.tang.principle.visitorDesign.user.User;
import com.tang.principle.visitorDesign.visitor.Visitor;

/**
 * ClassName:Student Package:com.tang.principle.visitorDesign.user.impl @Date:2021/10/27
 * 18:31 @Author:TYH
 */
public class Student extends User {

    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getRank() {
        return (int) (Math.random() * 100);
    }
}
