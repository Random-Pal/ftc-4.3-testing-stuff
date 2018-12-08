package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name = "TestInterativeOpMode", group = "Iterative Opmode")
public class TestInterativeOpMode extends OpMode {
    private DcMotor leftMotor = null;
    private DcMotor rightMotor = null;
    private ElapsedTime runTime = new ElapsedTime();

    @Override
    public void init() {
        telemetry.addData("Status","Initialized");

        leftMotor  = hardwareMap.get(DcMotor.class, "leftMotor");
        rightMotor = hardwareMap.get(DcMotor.class, "rightMotor");
        runTime    = hardwareMap.get(ElapsedTime.class, "runTime");

    }

    public void init_loop(){

    }

    @Override
    public void loop() {

    }

}
