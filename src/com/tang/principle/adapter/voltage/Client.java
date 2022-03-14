package com.tang.principle.adapter.voltage;

/**
 * ClassName:Client Package:com.tang.principle.adapter.voltage @Date:2021/10/20 21:38 @Author:TYH
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Voltage5V adapter = new VoltageAdapter();
        Voltage220v voltage220v = new Voltage220v();
        adapter.setVoltage220v(voltage220v);
        phone.changing(adapter);
    }
}
