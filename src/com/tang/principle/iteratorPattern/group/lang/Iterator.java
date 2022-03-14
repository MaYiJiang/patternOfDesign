package com.tang.principle.iteratorPattern.group.lang;

/**
 * ClassName:Iterator Package:com.tang.principle.iteratorPattern.group.lang @Date:2021/10/27
 * 20:42 @Author:TYH
 */
public interface Iterator<E> {
    boolean hasNext();

    E next();
}
