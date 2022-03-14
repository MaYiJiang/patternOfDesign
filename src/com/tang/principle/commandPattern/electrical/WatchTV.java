package com.tang.principle.commandPattern.electrical;

/**
 * ClassName:WatchTV Package:com.tang.principle.commandPattern.electrical @Date:2021/10/26
 * 21:46 @Author:TYH
 */
public class WatchTV extends ElectricalAppliance {
    public WatchTV(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println(name + "--on");
    }

    @Override
    public void off() {
        System.out.println(name + "--off");
    }
}
