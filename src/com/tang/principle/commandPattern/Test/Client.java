package com.tang.principle.commandPattern.Test;

import com.tang.principle.commandPattern.Contral;
import com.tang.principle.commandPattern.TurnOffButton;
import com.tang.principle.commandPattern.TurnOnButton;
import com.tang.principle.commandPattern.electrical.Light;
import com.tang.principle.commandPattern.electrical.WatchTV;

/**
 * ClassName:Client Package:com.tang.principle.commandPattern.Test @Date:2021/10/26
 * 21:43 @Author:TYH
 */
public class Client {
    public static void main(String[] args) {
        Light light = new Light("LED");
        WatchTV tv = new WatchTV("液晶");
        TurnOffButton turnOffButton = new TurnOffButton(tv);
        TurnOnButton turnOnButton = new TurnOnButton(tv);
        Contral contral = new Contral();
        contral.setButton(1, turnOffButton);
        contral.setButton(2, turnOnButton);
        contral.commandExecute(2);
        contral.commandExecute(1);
        contral.commandUndo();
    }
}
