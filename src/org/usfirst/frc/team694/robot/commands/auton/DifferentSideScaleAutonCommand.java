package org.usfirst.frc.team694.robot.commands.auton;


import org.usfirst.frc.team694.robot.FieldMapInterface;
import org.usfirst.frc.team694.robot.Robot;
import org.usfirst.frc.team694.robot.RobotMap;
import org.usfirst.frc.team694.robot.commands.GrabberOpenCommand;
import org.usfirst.frc.team694.robot.commands.LiftMoveToHeightCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class DifferentSideScaleAutonCommand extends CommandGroup {
    private FieldMapInterface quad = Robot.getRobotQuadrant();

    private static final double CURVE_1_DISTANCE_TOTAL = 445;
    private static final double CURVE_1_DISTANCE_TILL_TURN = 70;

    public DifferentSideScaleAutonCommand() {
        //addParallel(new DrivetrainLineSensorCommand(quad.getDistanceFromLineSensorToAutoLine()));
        /*addParallel(new DrivetrainRampSwerveCommand(
                quad.getTotalDistanceToTravelBeforeTurn() + quad.getTotalDistanceToTravelToReachOtherSideOfPlatformZone() + 15,
                quad.getTotalDistanceToTravelBeforeTurn(),
                -90
                ));
        */  
        addSequential(new DrivetrainRampSwerveCommand(
            CURVE_1_DISTANCE_TOTAL,
            CURVE_1_DISTANCE_TILL_TURN,
            -100
        ));

        /*
        addSequential(new DriveStraightWithRampingCommand(quad.getTotalDistanceToTravelBeforeTurn() + 3));
         

        addSequential(new DrivetrainRotateDegreesPIDCommand(-1 * quad.getAngleToTurnToReachPlatformZone()));

        //addParallel(new DrivetrainLineSensorPlatformZoneCommand());
        addSequential(new DriveStraightWithRampingCommand(quad.getTotalDistanceToTravelToReachOtherSideOfPlatformZone() + 15));
        */
        addSequential(new DrivetrainRotateDegreesPIDCommand(-1 * quad.getAngleToTurnToReachScaleSide()));

        addSequential(new LiftMoveToHeightCommand(89 - RobotMap.MIN_HEIGHT_OF_LIFT));//unsure about height

        //addParallel(new DrivetrainLineSensorCommand(quad.getDistanceFromRobotAfterTwoTurnsToNullTerritory()));
        addSequential(new DriveStraightWithRampingCommand(53));//quad.getTotalDistanceToTravelToReachScaleSide() - 5));

        addSequential(new GrabberOpenCommand());

    }

}