package com.tang.principle.mediator;

/** ClassName:Test Package:com.tang.principle.mediator @Date:2021/10/28 19:49 @Author:TYH */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague z3 = new Buyer("张3");
        Colleague l4 = new Seller("李4");
        mediator.register(z3);
        mediator.register(l4);
        z3.send("李4", "你好!");
    }
}
