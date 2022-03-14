package com.tang.principle.iteratorPattern.group.lang;

/**
 * ClassName:Collection Package:com.tang.principle.iteratorPattern.group.lang @Date:2021/10/27
 * 20:41 @Author:TYH
 */
public interface Collection<E, L> extends Iterable<E> {
    boolean add(E e);

    boolean remove(E e);

    boolean addLink(String key, L l);

    boolean removeLink(String key);

    Iterator<E> iterator();
}
