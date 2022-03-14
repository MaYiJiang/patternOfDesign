package com.tang.principle.commandPattern;

import com.tang.principle.commandPattern.electrical.ElectricalAppliance;

/**
 * ClassName:TurnOnLight Package:com.tang.principle.commandPattern @Date:2021/10/26
 * 21:14 @Author:TYH
 */
// 传入电器完成电器关按钮
public class TurnOnButton extends Command {
    private ElectricalAppliance appliance;

    public TurnOnButton(ElectricalAppliance appliance) {
        this.appliance = appliance;
    }

    @Override
    void execute() {
        appliance.on();
    }

    @Override
    void undo() {
        appliance.off();
    }
}
