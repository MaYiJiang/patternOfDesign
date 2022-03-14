package com.tang.principle.builder;

/** ClassName:Director Package:com.tang.principle.builder @Date:2021/10/19 21:23 @Author:TYH */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Director() {}

    public Product constructProduct() {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.createProduct();
    }
}
