package com.tang.principle.mementoPattern;

/**
 * ClassName:Memento Package:com.tang.principle.mementoPattern @Date:2021/10/29 16:06 @Author:TYH
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
