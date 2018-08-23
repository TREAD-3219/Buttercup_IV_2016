package org.usfirst.frc3219.ButtercupIV.commands;

import org.usfirst.frc3219.ButtercupIV.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AirHorn extends Command {
	boolean killTheClass = false;
	protected void initialize() {
		Robot.solenoids.airHornOn();
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void end() {
		Robot.solenoids.airHornOff();
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void excecute() {
		
	}
}
