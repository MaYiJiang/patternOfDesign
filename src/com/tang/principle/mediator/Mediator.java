package com.tang.principle.mediator;

/** ClassName:Mediator Package:com.tang.principle.mediator @Date:2021/10/28 19:31 @Author:TYH */
public interface Mediator {
    abstract void register(Colleague colleague);

    abstract void relay(String from, String to, String msg);
}
