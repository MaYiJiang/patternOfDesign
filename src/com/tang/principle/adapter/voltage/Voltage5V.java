package com.tang.principle.adapter.voltage;

/**
 * ClassName:Voltage5V Package:com.tang.principle.adapter.voltage @Date:2021/10/20 21:34 @Author:TYH
 */
public interface Voltage5V {
    void setVoltage110v();

    void setVoltage220v(Voltage220v voltage220v);

    void outPut();
}
