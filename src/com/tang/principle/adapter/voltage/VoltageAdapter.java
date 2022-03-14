package com.tang.principle.adapter.voltage;

/**
 * ClassName:VoltageAdapter Package:com.tang.principle.adapter.voltage @Date:2021/10/20
 * 21:35 @Author:TYH
 */
public class VoltageAdapter extends VoltageTrangeTo5V {
    private Voltage220v voltage220v;

    public void setVoltage220v(Voltage220v voltage220v) {
        this.voltage220v = voltage220v;
    }

    @Override
    public void outPut() {
        if (null != voltage220v) System.out.println("接收220v电压转为5v并输出");
    }
}
