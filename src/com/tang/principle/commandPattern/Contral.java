package com.tang.principle.commandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Contral Package:com.tang.principle.commandPattern @Date:2021/10/26 21:14 @Author:TYH
 */
public class Contral {
    private List<Command> listCommand;
    private Command command;

    public Contral() {
        this.listCommand = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            // 绑定6个空按钮
            listCommand.add(new UndoOfButton());
        }
    }

    public void commandExecute(int i) {
        this.command = listCommand.get(i - 1);
        command.execute();
    }

    public void commandUndo() {
        command.undo();
    }

    public void setButton(int i, Command command) {
        listCommand.set(i - 1, command);
    }
}
