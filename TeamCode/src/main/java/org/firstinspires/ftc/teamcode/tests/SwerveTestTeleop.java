package org.firstinspires.ftc.teamcode.tests;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.SwerveDrivetrain;

@TeleOp(name="Basic Swerve TeleOp", group="Swerve Drivetrain Tests")
public class SwerveTestTeleop extends LinearOpMode {

    SwerveDrivetrain drivetrain = new SwerveDrivetrain();

    @Override
    public void runOpMode() throws InterruptedException {
        // Pass the hardware context
        drivetrain.init(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {
            // Basic Robot-Centric configuration (Heading = 0)
            // Once you get a gyro running, replace 0 with your imu.getRobotYawPitchRollAngles().getYaw()
            drivetrain.drive(gamepad1, 0.0); // TODO get headingRadians

            idle();
        }
    }
}