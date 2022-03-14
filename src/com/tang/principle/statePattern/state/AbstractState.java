package com.tang.principle.statePattern.state;

import com.tang.principle.statePattern.context.Context;

/**
 * ClassName:AbstractState Package:com.tang.principle.statePattern.state.impl @Date:2021/10/30
 * 20:23 @Author:TYH
 */
public class AbstractState implements State {
    public AbstractState(Context account) {
        this.account = account;
    }

    RuntimeException exception = new RuntimeException("调用异常");
    protected Context account;

    @Override
    public void deposit(double amount) {
        throw exception;
    }

    @Override
    public void withDraw(double amount) {
        throw exception;
    }

    @Override
    public void computeInterest() {
        throw exception;
    }

    @Override
    public void stateChange() {
        throw exception;
    }
}
