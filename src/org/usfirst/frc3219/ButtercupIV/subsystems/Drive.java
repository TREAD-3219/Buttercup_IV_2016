package org.usfirst.frc3219.ButtercupIV.subsystems;

import org.usfirst.frc3219.ButtercupIV.RobotMap;
import org.usfirst.frc3219.ButtercupIV.commands.StickDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem {

	private RobotDrive driveBase;
	
	@Override
	protected void initDefaultCommand() {
		this.setDefaultCommand(new StickDrive());
		
	}
	
	public Drive() {
		driveBase = new RobotDrive(RobotMap.leftDrive, RobotMap.rightDrive);
		
	}
	
	public void TankDrive(double leftDrive, double rightDrive) {
		driveBase.tankDrive(leftDrive, rightDrive);
	}

}
