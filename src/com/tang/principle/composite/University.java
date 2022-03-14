package com.tang.principle.composite;

import java.util.ArrayList;
import java.util.List;

/** ClassName:University Package:com.tang.principle.composite @Date:2021/10/22 18:18 @Author:TYH */
public class University extends OrganizationComponent {
    private List<OrganizationComponent> component = new ArrayList<>();

    public University(String name, String descrtion) {
        super(name, descrtion);
    }

    @Override
    public void add(OrganizationComponent component) {
        this.component.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        component.remove(component);
    }

    @Override
    protected void print() {
        System.out.println(this.getName() + "----");
        component.forEach(OrganizationComponent::print);
    }
}
