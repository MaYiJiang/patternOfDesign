package com.tang.principle.mediator;

/** ClassName:Buyer Package:com.tang.principle.mediator @Date:2021/10/28 19:40 @Author:TYH */
public class Buyer extends Colleague {
    public Buyer(String name) {
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
