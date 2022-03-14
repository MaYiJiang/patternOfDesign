package com.tang.principle.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/** ClassName:WechatServer Package:com.tang.principle.observer @Date:2021/10/28 18:06 @Author:TYH */
public class WechatServer {
    private List<Observer> list;
    private String msg = "";

    public WechatServer() {
        list = new ArrayList<>(10);
    }

    public synchronized void addObserver(Observer o) {
        list.add(o);
    }

    public synchronized void deleteObserver(Observer o) {
        list.remove(o);
    }

    public void notifyObservers() {
        list.forEach((x) -> x.update(new Observable(), msg));
    }

    public void updateMessa(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
