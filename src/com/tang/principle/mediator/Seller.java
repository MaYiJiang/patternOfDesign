package com.tang.principle.mediator;

/** ClassName:Seller Package:com.tang.principle.mediator @Date:2021/10/28 19:41 @Author:TYH */
public class Seller extends Colleague {

    public Seller(String name) {
        super(name);
    }

    @Override
    public void send(String to, String msg) {
        mediator.relay(this.getName(), to, msg);
    }

    @Override
    public void receive(String from, String msg) {
        System.out.println("收到来自" + from + "的来信:");
        System.out.println("       " + msg);
    }
}
