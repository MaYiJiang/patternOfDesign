package com.tang.principle.protoType;

import java.io.*;
import java.util.Date;

/** ClassName:Sheep Package:com.tang.principle.protoType @Date:2021/10/19 16:58 @Author:TYH */
public class Sheep implements Cloneable, Serializable {
    private String name;
    private Integer age;
    private Date birthday;
    private static final long serialVersionUID = 12345L;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Sheep copy = (Sheep) super.clone();
        copy.birthday = (Date) this.birthday.clone();
        return copy;
    }

    public Sheep deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        Sheep sheep = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            sheep = (Sheep) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null) bos.close();
                if (oos != null) oos.close();
                if (bis != null) bis.close();
                if (ois != null) ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sheep;
    }

    public Sheep(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Sheep{" + "name='" + name + '\'' + ", age=" + age + ", birthday=" + birthday + '}';
    }
}
