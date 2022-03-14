package com.tang.principle.builder.order;

/** ClassName:Waiter Package:com.tang.principle.builder.order @Date:2021/10/19 22:31 @Author:TYH */
public abstract class Waiter {
    public abstract Waiter orderA(String msg);

    public abstract Waiter orderB(String msg);

    public abstract Waiter orderC(String msg);

    public abstract Producter getProductor();
}
