package org.firstinspires.ftc.teamcode.tests;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.SwerveDrivetrain;

@TeleOp(name="Basic Swerve TeleOp", group="Swerve Drivetrain Tests")
public class SwerveTestTeleop extends LinearOpMode {

    SwerveDrivetrain drivetrain = new SwerveDrivetrain();

    @Override
    public void runOpMode() throws InterruptedException {

        drivetrain.init(hardwareMap);

        waitForStart();



        while (opModeIsActive()) {
            drivetrain.drive(gamepad1);

            idle();
        }
    }
}