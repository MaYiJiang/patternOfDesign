package com.tang.principle.visitorDesign;

import com.tang.principle.visitorDesign.user.User;
import com.tang.principle.visitorDesign.user.impl.Student;
import com.tang.principle.visitorDesign.user.impl.Teacher;
import com.tang.principle.visitorDesign.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:DataView Package:com.tang.principle.visitorDesign @Date:2021/10/27 18:54 @Author:TYH
 */
public class DataView {
    List<User> userList = new ArrayList<>();

    public DataView() {
        userList.add(new Student("谢⻜机", "重点班", "⼀年⼀班"));
        userList.add(new Student("windy", "重点班", "⼀年⼀班"));
        userList.add(new Student("⼤⽑", "普通班", "⼆年三班"));
        userList.add(new Student("Shing", "普通班", "三年四班"));
        userList.add(new Teacher("BK", "特级教师", "⼀年⼀班"));
        userList.add(new Teacher("娜娜Goddess", "特级教师", "⼀年⼀班"));
        userList.add(new Teacher("dangdang", "普通教师", "⼆年三班"));
        userList.add(new Teacher("泽东", "实习教师", "三年四班"));
    }
    // 展示
    public void show(Visitor visitor) {
        for (User user : userList) {
            user.accept(visitor);
        }
    }
}
