package org.usfirst.frc.team694.robot.commands;

import org.usfirst.frc.team694.robot.Robot;
import org.usfirst.frc.team694.robot.subsystems.Blender;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Spin extends Command {

    private Blender blender = Robot.blender;
    
    public Spin() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.blender);
    }
    
    // Called just before this Command runs the first time
	@Override
	protected void initialize() {
		blender.centerMotor.set(1.0);
		blender.wheelMotor.set(0.5);
	}

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
