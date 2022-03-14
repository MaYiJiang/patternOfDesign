package com.tang.principle.builder.order;

/**
 * ClassName:WaiterLi Package:com.tang.principle.builder.order @Date:2021/10/19 22:35 @Author:TYH
 */
public class WaiterLi extends Waiter {
    private Producter producter = null;
    // 选取套餐传入
    public WaiterLi(Producter product) {
        this.producter = product;
    }

    public void setProducter(Producter producter) {
        this.producter = producter;
    }

    public WaiterLi() {}

    @Override
    public Waiter orderA(String msg) {
        producter.setPackagesA(msg);
        return this;
    }

    @Override
    public Waiter orderB(String msg) {
        producter.setPackagesB(msg);
        return this;
    }

    @Override
    public Waiter orderC(String msg) {
        producter.setPackagesC(msg);
        return this;
    }

    @Override
    public Producter getProductor() {
        return producter;
    }
}
