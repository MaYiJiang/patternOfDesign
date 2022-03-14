package com.tang.principle.commandPattern;

/**
 * ClassName:UndoOfButton Package:com.tang.principle.commandPattern @Date:2021/10/26
 * 21:16 @Author:TYH
 */
// 空实现  用于为按钮附初始值->空操作
public class UndoOfButton extends Command {
    @Override
    void execute() {
        System.out.println("请添加按钮");
    }

    @Override
    void undo() {
        System.out.println("请添加按钮");
    }
}
