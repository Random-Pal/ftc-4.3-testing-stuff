package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous
public class testAutomounous extends LinearOpMode {
    private DcMotor backLeft;
    private DcMotor backRight;
    private Servo testServo;
    private double leftPower;
    private double rightPower;
    private double drive;
    private double turn;
    private double servoPosition;
    private double power;

    @Override
    public void runOpMode() {
        backLeft = hardwareMap.get(DcMotor.class,"backLeft");
        backRight = hardwareMap.get(DcMotor.class,"backRight");
        testServo = hardwareMap.get(Servo.class,"testServo");

        backLeft.setDirection(DcMotor.Direction.REVERSE);
        backRight.setDirection(DcMotor.Direction.FORWARD);

        testServo.setPosition(Servo.MIN_POSITION);
        backRight.setPower(0.0);
        backLeft.setPower(0.0);

        waitForStart();
        sleep(5000);
        backLeft.setPower(0.3);
        backRight.setPower(0.3);
        sleep(5000);
        backLeft.setPower(0.0);
        backRight.setPower(0.0);
        testServo.setPosition(Servo.MAX_POSITION);
        sleep(5000);
        testServo.setPosition(Servo.MIN_POSITION);
        sleep(5000);


    }
    public void DriveForward (double power) {

    }
}
