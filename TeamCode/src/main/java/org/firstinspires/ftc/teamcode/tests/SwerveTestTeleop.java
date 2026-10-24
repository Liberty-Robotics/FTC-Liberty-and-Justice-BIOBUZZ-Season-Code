package org.firstinspires.ftc.teamcode.tests;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.SwerveDrivetrain;

@TeleOp(name="Basic Swerve Movement Teleop", group="Swerve Drivetrain Tests")
public class SwerveTestTeleop extends LinearOpMode {

    SwerveDrivetrain swerve = new SwerveDrivetrain();

    @Override
    public void runOpMode() {

        swerve.init(hardwareMap);
        telemetry.addLine("swerve initialization was a success!");
        telemetry.update();

        waitForStart();



        while (opModeIsActive()) {
            telemetry.addLine("swerve drive has started");
            swerve.drive(gamepad1, telemetry);
            telemetry.update();

            idle();
        }
    }
}