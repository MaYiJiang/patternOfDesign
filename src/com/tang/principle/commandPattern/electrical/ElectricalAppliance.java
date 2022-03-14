package com.tang.principle.commandPattern.electrical;

/**
 * ClassName:ElectricalAppliance Package:com.tang.principle.commandPattern @Date:2021/10/26
 * 21:22 @Author:TYH
 */
public abstract class ElectricalAppliance {
    public String name = "";

    public ElectricalAppliance(String name) {
        this.name = name;
    }

    public abstract void on();

    public abstract void off();
}
