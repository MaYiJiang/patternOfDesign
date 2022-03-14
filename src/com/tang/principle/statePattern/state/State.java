package com.tang.principle.statePattern.state;

/**
 * ClassName:State Package:com.tang.principle.statePattern.state @Date:2021/10/30 20:15 @Author:TYH
 */
public interface State {
    // 存钱
    public void deposit(double amount);
    // 借贷
    public void withDraw(double amount);
    // 利息
    public void computeInterest();
    // 变更状态
    public void stateChange();
}
