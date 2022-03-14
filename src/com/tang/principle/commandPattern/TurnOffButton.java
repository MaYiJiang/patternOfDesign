package com.tang.principle.commandPattern;

import com.tang.principle.commandPattern.electrical.ElectricalAppliance;

/**
 * ClassName:TurnOffLight Package:com.tang.principle.commandPattern @Date:2021/10/26
 * 21:14 @Author:TYH
 */
// 传入电器用于绑定关按钮
public class TurnOffButton extends Command {
    private ElectricalAppliance appliance;

    public TurnOffButton(ElectricalAppliance appliance) {
        this.appliance = appliance;
    }

    @Override
    void execute() {
        appliance.off();
    }

    @Override
    void undo() {
        appliance.on();
    }
}
