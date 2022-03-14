package com.tang.principle.visitorDesign.visitor;

import com.tang.principle.visitorDesign.user.impl.Student;
import com.tang.principle.visitorDesign.user.impl.Teacher;

/**
 * ClassName:Visitor Package:com.tang.principle.visitorDesign.visitor @Date:2021/10/27
 * 18:32 @Author:TYH
 */
public interface Visitor {
    void visit(Student student);

    void visit(Teacher teacher);
}
