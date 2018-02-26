package org.usfirst.frc.team694.robot.commands.auton;

import org.usfirst.frc.team694.robot.RobotMap;
import org.usfirst.frc.team694.robot.commands.GrabberOpenCommand;
import org.usfirst.frc.team694.robot.commands.LiftMoveToHeightCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ScaleScoreSecondTimeCommand extends CommandGroup {

    public ScaleScoreSecondTimeCommand(boolean isRightSide) {

        // Rotate back to where we were before grabbing the cube
        if (isRightSide) {
            addSequential(new DrivetrainRotateAbsoluteDegreesPIDCommand(-165));
        } else {
            addSequential(new DrivetrainRotateAbsoluteDegreesPIDCommand(165));
        }

        addSequential(new DrivetrainMoveInchesEncoderCommand(-0.3, 20), 5);

        addParallel(new LiftMoveToHeightCommand(89 - RobotMap.MIN_HEIGHT_OF_LIFT));
        addSequential(new DrivetrainRotateAbsoluteDegreesPIDCommand(0));

        addSequential(new DrivetrainMoveInchesEncoderCommand(0.3, 20));

        addSequential(new GrabberOpenCommand());
    }
}
