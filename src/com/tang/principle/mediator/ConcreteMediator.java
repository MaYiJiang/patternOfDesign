package com.tang.principle.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:ConcreteMediator Package:com.tang.principle.mediator @Date:2021/10/28 19:41 @Author:TYH
 */
public class ConcreteMediator implements Mediator {
    private List<Colleague> list;

    public ConcreteMediator() {
        this.list = new ArrayList<>();
    }

    @Override
    public void register(Colleague colleague) {
        list.add(colleague);
        colleague.setMediator(this);
    }

    @Override
    public void relay(String from, String to, String msg) {
        list.forEach(
                (x) -> {
                    String name = x.getName();
                    if (to.equals(name)) {
                        x.receive(from, msg);
                        return;
                    }
                });
        //        System.out.println("查无此人!");
        //        return;
    }
}
