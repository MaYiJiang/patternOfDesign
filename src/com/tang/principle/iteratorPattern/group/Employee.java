package com.tang.principle.iteratorPattern.group;

/**
 * ClassName:Employee Package:com.tang.principle.iteratorPattern.group @Date:2021/10/27
 * 20:47 @Author:TYH
 */
public class Employee {
    private String uId; // ID
    private String name; // 姓名
    private String desc; // 备注

    public Employee(String uId, String name, String desc) {
        this.uId = uId;
        this.name = name;
        this.desc = desc;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    // ...get/set
}
