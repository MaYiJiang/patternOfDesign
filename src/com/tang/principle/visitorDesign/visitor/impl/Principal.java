package com.tang.principle.visitorDesign.visitor.impl;

import com.tang.principle.visitorDesign.user.impl.Student;
import com.tang.principle.visitorDesign.user.impl.Teacher;
import com.tang.principle.visitorDesign.visitor.Visitor;

/**
 * ClassName:Principal Package:com.tang.principle.visitorDesign.visitor.impl @Date:2021/10/27
 * 18:37 @Author:TYH
 */
public class Principal implements Visitor {
    @Override
    public void visit(Student student) {
        System.out.println("学生的姓名:" + student.name + "  学生的班级:" + student.clazz);
    }

    @Override
    public void visit(Teacher teacher) {
        System.out.println(
                "老师的姓名:"
                        + teacher.name
                        + "  老师的班级:"
                        + teacher.clazz
                        + "  老师的升学率:"
                        + teacher.entranceRatio());
    }
}
