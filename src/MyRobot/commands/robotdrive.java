package MyRobot.commands;

import MyRobot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class robotdrive extends Command{

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
	Robot.drive.driveforwardtwo();
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
	}

}
