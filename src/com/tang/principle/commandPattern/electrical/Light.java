package com.tang.principle.commandPattern.electrical;

/** ClassName:Light Package:com.tang.principle.commandPattern @Date:2021/10/26 21:13 @Author:TYH */
// 被接受者  接收命令执行 开 和 关 功能
public class Light extends ElectricalAppliance {

    public Light(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println(name + "on");
    }

    @Override
    public void off() {
        System.out.println(name + "off");
    }
}
