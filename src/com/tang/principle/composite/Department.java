package com.tang.principle.composite;

/** ClassName:Department Package:com.tang.principle.composite @Date:2021/10/22 18:18 @Author:TYH */
public class Department extends OrganizationComponent {

    public Department(String name, String descrtion) {
        super(name, descrtion);
    }

    @Override
    protected void print() {
        System.out.println(this.getName() + this.getDescrtion());
    }
}
