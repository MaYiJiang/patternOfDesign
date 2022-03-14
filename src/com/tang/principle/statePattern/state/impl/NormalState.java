package com.tang.principle.statePattern.state.impl;

import com.tang.principle.statePattern.context.Context;
import com.tang.principle.statePattern.state.AbstractState;

/**
 * ClassName:NormalState 正常状态 Package:com.tang.principle.statePattern.state.impl @Date:2021/10/30
 * 20:16 @Author:TYH
 */
public class NormalState extends AbstractState {

    public NormalState(Context account) {
        super(account);
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
    }

    @Override
    public void withDraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateChange();
    }

    @Override
    public void stateChange() {
        if (account.getBalance() < 0 && account.getBalance() >= -2000) {
            account.setState(new OverdraftState(this.account));
        } else if (account.getBalance() < -2000) {
            account.setState(new RestrictedState(this.account));
        }
    }

    @Override
    public void computeInterest() {
        System.out.println("    无利息");
    }
}
