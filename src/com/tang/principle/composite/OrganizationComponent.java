package com.tang.principle.composite;

/**
 * ClassName:OrganizationComponent Package:com.tang.principle.composite @Date:2021/10/22
 * 18:18 @Author:TYH
 */
public abstract class OrganizationComponent {
    private String name;
    private String descrtion;

    protected void add(OrganizationComponent component) {
        System.out.println("未正确重写改方法");
    }

    protected void remove(OrganizationComponent component) {
        System.out.println("未正确重写改方法");
    }

    public OrganizationComponent(String name, String descrtion) {
        this.name = name;
        this.descrtion = descrtion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrtion() {
        return descrtion;
    }

    public void setDescrtion(String descrtion) {
        this.descrtion = descrtion;
    }

    protected abstract void print();
}
