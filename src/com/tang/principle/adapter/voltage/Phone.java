package com.tang.principle.adapter.voltage;

/** ClassName:Phone Package:com.tang.principle.adapter.voltage @Date:2021/10/20 21:37 @Author:TYH */
public class Phone {
    public void changing(Voltage5V voltage5V) {
        voltage5V.outPut();
        System.out.println("接收5v电压为手机充电");
    }
}
