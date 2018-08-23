package org.usfirst.frc3219.ButtercupIV.commands;

import org.usfirst.frc3219.ButtercupIV.OI;
import org.usfirst.frc3219.ButtercupIV.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LeftCannon extends Command {

	
	@Override
	protected void initialize() {
		if (Robot.oi.gamepad.getRawAxis(2) > 0.8) {
			Robot.solenoids.leftAirCannonOn();
		}
		this.setTimeout(0.3);
	}
	
	@Override
	protected boolean isFinished() {
		
		return this.isTimedOut();
	}
	
	@Override
	protected void end() {
		Robot.solenoids.leftAirCannonOff();
	}
	

}
