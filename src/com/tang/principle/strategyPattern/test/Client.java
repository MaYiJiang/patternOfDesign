package com.tang.principle.strategyPattern.test;

import com.tang.principle.strategyPattern.context.MovieTicket;
import com.tang.principle.strategyPattern.strategy.impl.VIPDiscount;

/**
 * ClassName:Client Package:com.tang.principle.strategyPattern.test @Date:2021/10/31
 * 9:01 @Author:TYH
 */
public class Client {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        movieTicket.setPrice(60);
        System.out.println("初始价格为:" + movieTicket.getPrice());
        movieTicket.setDicount(new VIPDiscount());
        System.out.println("折扣后:" + movieTicket.getPrice());
    }
}
