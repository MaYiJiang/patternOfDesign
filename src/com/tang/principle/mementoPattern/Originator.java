package com.tang.principle.mementoPattern;

/**
 * ClassName:Originator Package:com.tang.principle.mementoPattern @Date:2021/10/29 16:06 @Author:TYH
 */
public class Originator {
    private String state;
    public CareTaker careTaker;

    public Originator() {
        careTaker = new CareTaker();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        careTaker.addToListMenento(saveToMenmento(state));
    }

    public Memento saveToMenmento(String state) {
        return new Memento(state);
    }
}
