package com.tang.principle.adapter.voltage;

/**
 * ClassName:VoltageTrangeTo5V Package:com.tang.principle.adapter.voltage @Date:2021/10/20
 * 21:43 @Author:TYH
 */
public abstract class VoltageTrangeTo5V implements Voltage5V {
    @Override
    public void setVoltage110v() {}

    @Override
    public void setVoltage220v(Voltage220v voltage220v) {}

    @Override
    public void outPut() {
        System.out.println("接收高电压转为5v电压");
    }
}
