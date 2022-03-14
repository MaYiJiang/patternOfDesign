package com.tang.principle.adapter;

/** ClassName:UsbConverter Package:com.tang.principle.adapter @Date:2021/10/20 11:07 @Author:TYH */
public class UsbConverter implements Converter {
    private WireST wire;

    public void setWire(WireST wire) {
        this.wire = wire;
    }

    @Override
    public void net() {
        wire.request();
    }
}
