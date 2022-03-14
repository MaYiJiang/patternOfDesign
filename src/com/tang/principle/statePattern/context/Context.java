package com.tang.principle.statePattern.context;

import com.tang.principle.statePattern.state.State;
import com.tang.principle.statePattern.state.impl.NormalState;

/**
 * ClassName:Context Package:com.tang.principle.statePattern.context @Date:2021/10/30
 * 20:15 @Author:TYH
 */
public class Context {
    private State state;
    private String owner;
    private double balance;

    public Context(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.state = new NormalState(this);
    }

    public void deposit(double amount) {
        System.out.println("存" + amount + "元");
        this.state.deposit(amount);
        System.out.println("当前余额:" + this.getBalance());
    }

    public void withDraw(double amount) {
        System.out.println("取" + amount + "元");
        this.state.withDraw(amount);
        System.out.println("当前余额:" + this.getBalance());
        state.stateChange();
    }

    public void setState(State state) {
        this.state = state;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void getInterest() {
        state.computeInterest();
    }
}
