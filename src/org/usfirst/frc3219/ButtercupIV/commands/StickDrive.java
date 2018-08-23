package org.usfirst.frc3219.ButtercupIV.commands;

import org.usfirst.frc3219.ButtercupIV.Robot;
import org.usfirst.frc3219.ButtercupIV.subsystems.Drive;
import org.usfirst.frc3219.ButtercupIV.OI;
import edu.wpi.first.wpilibj.command.Command;

public class StickDrive extends Command {
	
	
	public StickDrive() {
		this.requires(Robot.drive);
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}

	protected void init() {
		
	}

	/*	Assignments
	 *  Left Trigger: 2
	 * Right Trigger: 3
	 *  Left Stick Y: 1
	 * Right Stick Y: 5
	 * 
	 */
	
	private static final byte LEFT_STICK_X = 0;
	private static final byte LEFT_STICK_Y = 1;
	private static final byte LEFT_TRIGGER = 2;
	private static final byte RIGHT_TRIGGER = 3;
	private static final byte RIGHT_STICK_X = 4;
	private static final byte RIGHT_STICK_Y = 5;
	
	
	
	
	@Override
	protected void execute() {

		// Throttle
		//double leftTrigger = Robot.oi.gamepad.getRawAxis(LEFT_TRIGGER)*-1;
		double rightTrigger = Robot.oi.gamepad.getRawAxis(RIGHT_TRIGGER);
		double throttleRaw = ((/*leftTrigger + */rightTrigger)/2)+0.5; // magic numbers
		double throttleScaled = (throttleRaw*0.6)+0.4; // more magic numbers
		
		// Stick
		double leftStick = Robot.oi.gamepad.getRawAxis(LEFT_STICK_Y);
		double rightStick = Robot.oi.gamepad.getRawAxis(RIGHT_STICK_Y);
		Robot.drive.TankDrive(leftStick*throttleScaled, rightStick*throttleScaled);
		
	
		
	}
}
