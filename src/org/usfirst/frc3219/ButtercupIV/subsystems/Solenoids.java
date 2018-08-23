package org.usfirst.frc3219.ButtercupIV.subsystems;

import org.usfirst.frc3219.ButtercupIV.Robot;
import org.usfirst.frc3219.ButtercupIV.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Solenoids extends Subsystem {

	@Override
	protected void initDefaultCommand() {
		
		
	}

	//Left Air Cannon
	public void leftAirCannonOn() {
		RobotMap.leftCannon.set(true);
		
	}
	
	public void leftAirCannonOff() {
		RobotMap.leftCannon.set(false);
	}
	
	//Right Air Cannon
	public void rightAirCannonOn() {
		RobotMap.rightCannon.set(true);
	}
	
	public void rightAirCannonOff() {
		RobotMap.rightCannon.set(false);
	}
	
	public void airHornOn() {
		RobotMap.airHorn.set(true);
	}
	
	public void airHornOff() {
		RobotMap.airHorn.set(false);
	}
}
