package com.tang.principle.builder;

/** ClassName:Builder Package:com.tang.principle.builder @Date:2021/10/19 21:13 @Author:TYH */
public abstract class Builder {
    protected Product product = new Product();

    public abstract void buildA();

    public abstract void buildC();

    public abstract void buildB();

    public Product createProduct() {
        return product;
    }
}
