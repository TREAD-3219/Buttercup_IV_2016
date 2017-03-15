package MyRobot.commands;

import org.usfirst.frc3219.TREAD.Robot;

import MyRobot.subsystems.Drive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

public class robotdrive extends Command {

	Joystick robotDrive = Robot.oi.LeftStick;

	public robotdrive() {
		requires((Subsystem) Robot.drive);
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.drive.stopMotors();
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		// Robot.drive.stickDrive(driveStick.getY(), driveStick.getX(),
		// -driveStick.getThrottle());
		Robot.drive.tankDrive(-Robot.OI.leftStick.getY(), -Robot.OI.rightStick.getY());
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		Drive.driveforwardtwo();
		this.setTimeout(10);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return this.isTimedOut();
        return false;
	}

}
