package com.tang.principle.mediator;

/** ClassName:Colleague Package:com.tang.principle.mediator @Date:2021/10/28 19:33 @Author:TYH */
public abstract class Colleague {
    protected String name;
    protected Mediator mediator;

    public Colleague(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String to, String msg);

    public abstract void receive(String from, String msg);
}
