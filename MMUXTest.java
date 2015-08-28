package org.wheeler.robotics.MMUXController;

import com.qualcomm.ftccommon.DbgLog;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import org.wheeler.robotics.MMUXController.MMUX;
//import com.qualcomm.robotcore.hardware.Gamepad;
//import com.qualcomm.robotcore.eventloop.EventLoopManager;
//import com.qualcomm.robotcore.robocol.RobocolDatagramSocket;


/**
 * Created by lucien on 6/10/15.
 */

public class MMUXTest extends OpMode {
    MMUX MMux;
    public void init() {
        MMux = new MMUX(hardwareMap,"LModule",0);
        MMux.motorA.setPower((byte)100);
    }

    public void loop() {
        telemetry.addData("Position: ", MMux.motorA.getEncoderValue());
    }
}
