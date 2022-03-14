package com.tang.principle.statePattern.state.impl;

import com.tang.principle.statePattern.context.Context;
import com.tang.principle.statePattern.state.AbstractState;

/**
 * ClassName:RestrictedState 限制状态
 * Package:com.tang.principle.statePattern.state.impl @Date:2021/10/30 20:16 @Author:TYH
 */
public class RestrictedState extends AbstractState {
    public RestrictedState(Context account) {
        super(account);
    }

    @Override
    public void computeInterest() {
        System.out.println("利息50%");
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateChange();
    }

    @Override
    public void withDraw(double amount) {
        System.out.println("取钱失败!");
    }

    @Override
    public void stateChange() {
        if (account.getBalance() >= 0) {
            account.setState(new NormalState(this.account));
        } else if (account.getBalance() >= -2000) {
            account.setState(new OverdraftState(this.account));
        }
    }
}
