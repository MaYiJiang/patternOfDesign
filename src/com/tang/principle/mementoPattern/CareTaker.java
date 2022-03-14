package com.tang.principle.mementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:CareTaker Package:com.tang.principle.mementoPattern @Date:2021/10/29 16:06 @Author:TYH
 */
public class CareTaker {
    private List<Memento> list;

    public CareTaker() {
        list = new ArrayList<>();
    }

    public void addToListMenento(Memento memento) {
        list.add(memento);
    }

    public String getIndexOfState(int index) {
        return list.get(index).getState();
    }
}
