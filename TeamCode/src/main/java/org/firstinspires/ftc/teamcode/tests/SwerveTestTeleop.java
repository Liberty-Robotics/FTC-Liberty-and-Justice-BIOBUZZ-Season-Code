package org.firstinspires.ftc.teamcode.tests;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.mechanisms.SwerveDrivetrain;

@TeleOp(name="Basic Swerve Movement Teleop", group="Swerve Drivetrain Tests")
public class SwerveTestTeleop extends LinearOpMode {

    SwerveDrivetrain swerve = new SwerveDrivetrain();
    DcMotor intake = null;

    @Override
    public void runOpMode() {

        intake = hardwareMap.get(DcMotor.class, "intake");
        swerve.init(hardwareMap);

        waitForStart();



        while (opModeIsActive()) {
            swerve.drive(gamepad1);
            boolean dpad_right = gamepad1.dpad_right;
            if (dpad_right == true) {
                intake.setPower(0.8);
            } else {
                intake.setPower(0);
            }
            idle();
        }
    }
}