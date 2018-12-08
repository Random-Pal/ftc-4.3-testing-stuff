package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;

@TeleOp
public class TestDrive extends LinearOpMode {
    private DcMotor frontLeft;
    private DcMotor frontRight;
    private float drive;
    private float turn;
    private float leftPower;
    private float rightPower;

    @Override
    public void runOpMode() {
        telemetry.addData("Status","Initialized");
        telemetry.update();

        frontLeft = hardwareMap.get(DcMotor.class,"frontLeft");
        frontRight = hardwareMap.get(DcMotor.class,"frontRight");

        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        frontRight.setDirection(DcMotorSimple.Direction.FORWARD);

        waitForStart();
        while(opModeIsActive()) {
            drive = -gamepad1.left_stick_y;
            turn = gamepad1.right_stick_x;

            leftPower = drive + turn;
            rightPower = drive - turn;

            leftPower = Range.clip(drive + turn,-1,1);
            rightPower = Range.clip(drive - turn,-1,1);

            frontLeft.setPower(leftPower);
            frontRight.setPower(rightPower);
            idle();

        }

    }
}
