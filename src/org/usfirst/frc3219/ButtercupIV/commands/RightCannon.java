package org.usfirst.frc3219.ButtercupIV.commands;

import org.usfirst.frc3219.ButtercupIV.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RightCannon extends Command {

	@Override
	protected void initialize() {
		Robot.solenoids.rightAirCannonOn(); //TODO access properly
		this.setTimeout(0.3);
	}
	
	@Override
	protected boolean isFinished() {
		
		return this.isTimedOut();
	}
	
	@Override
	protected void end() {
		Robot.solenoids.rightAirCannonOff();
	}

}
