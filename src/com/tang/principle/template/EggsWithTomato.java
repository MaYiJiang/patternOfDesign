package com.tang.principle.template;

/**
 * ClassName:EggsWithTomato Package:com.tang.principle.template @Date:2021/10/26 18:19 @Author:TYH
 */
public class EggsWithTomato extends Cooking {
    @Override
    void carriedDish() {
        System.out.println("鸡蛋西红柿装盘");
    }

    @Override
    void doing() {
        System.out.println("导入锅中炒");
    }

    @Override
    void preparation() {
        System.out.println("装碟子,端给客人");
    }
}
