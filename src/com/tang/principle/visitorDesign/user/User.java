package com.tang.principle.visitorDesign.user;

import com.tang.principle.visitorDesign.visitor.Visitor;

/**
 * ClassName:User Package:com.tang.principle.visitorDesign.user @Date:2021/10/27 18:29 @Author:TYH
 */
public abstract class User {
    public String name;
    public String identity;
    public String clazz;

    public User(String name, String identity, String clazz) {
        this.name = name;
        this.identity = identity;
        this.clazz = clazz;
    }

    public abstract void accept(Visitor visitor);
}
