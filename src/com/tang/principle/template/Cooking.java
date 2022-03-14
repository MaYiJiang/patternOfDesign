package com.tang.principle.template;

/** ClassName:Cooking Package:com.tang.principle.template @Date:2021/10/26 18:11 @Author:TYH */
public abstract class Cooking {
    public final void cooking() {
        carriedDish();
        doing();
        preparation();
    }

    abstract void carriedDish();

    abstract void doing();

    abstract void preparation();
}
