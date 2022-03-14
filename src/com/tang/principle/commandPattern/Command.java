package com.tang.principle.commandPattern;

/**
 * ClassName:Command Package:com.tang.principle.commandPattern @Date:2021/10/26 21:14 @Author:TYH
 */
// 抽象命令  执行操作与撤销操作给子类实现
public abstract class Command {
    abstract void execute();

    abstract void undo();
}
