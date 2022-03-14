package com.tang.principle.builder.order;

/**
 * ClassName:OrderTest Package:com.tang.principle.builder.order @Date:2021/10/19 22:42 @Author:TYH
 */
public class OrderTest {
    public static void main(String[] args) {
        Producter producter = new Producter();
        WaiterLi waiterLi = new WaiterLi(producter);
        System.out.println("默认套餐" + waiterLi.getProductor());
        waiterLi.orderA("炸鸡").orderB("鸡排").orderC("鸡腿");
        System.out.println("更换套餐" + producter);
    }
}
