package com.tang.principle.adapter;

/** ClassName:Computer Package:com.tang.principle.adapter @Date:2021/10/20 11:06 @Author:TYH */
public class Computer {
    public void net(Converter converter) {
        converter.net();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        UsbConverter usbConverter = new UsbConverter();
        Wire wire = new Wire();
        Wire2 wire2 = new Wire2();
        usbConverter.setWire(wire);
        computer.net(usbConverter);
        System.out.println("----");
        usbConverter.setWire(wire2);
        computer.net(usbConverter);
    }
}
