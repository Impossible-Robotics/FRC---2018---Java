package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Controller extends Robot {

    private Joystick xboxController;

    public Controller(int port){
        xboxController = new Joystick(port);
    }

    public boolean getA()
	{
		return xboxController.getRawButton(1);
	}
	public boolean getB()
	{
		return xboxController.getRawButton(2);
	}
	public boolean getX()
	{
		return xboxController.getRawButton(3);
	}
	public boolean getY()
	{
		return xboxController.getRawButton(4);
	}
	public boolean getLBumper()
	{
		return xboxController.getRawButton(5);
	}
	public boolean getRBumper()
	{
		return xboxController.getRawButton(6);
	}
	public boolean getBack()
	{
		return xboxController.getRawButton(7);
	}
	public boolean getStart()
	{
		return xboxController.getRawButton(8);
	}
	public boolean getLSClick()
	{
		return xboxController.getRawButton(9);
	}
	public boolean getRSClick()
	{
		return xboxController.getRawButton(10);
	}
	public int getDPad()
	{
		return xboxController.getPOV();
	}
	
	//BUTTONS DPAD
	public boolean getDPadUp()
	{
		return xboxController.getPOV() == 0;
	}
	public boolean getDPadRight()
	{
		return xboxController.getPOV() == 90;
	}
	public boolean getDPadDown()
	{
		return xboxController.getPOV() == 180;
	}
	public boolean getDPadLeft()
	{
		return xboxController.getPOV() == 270;
	}
	public boolean getDPadUpRight()
	{
		return xboxController.getPOV() == 45;
	}
	public boolean getDPadDownRight()
	{
		return xboxController.getPOV() == 135;
	}
	public boolean getDPadDownLeft()
	{
		return xboxController.getPOV() == 225;
	}
	public boolean getDPadUpLeft()
	{
		return xboxController.getPOV() == 315;
	}
	
	//1. = full RT, -1. = full LT
	public double getAxisTriggers()
	{
		return xboxController.getRawAxis(3) - xboxController.getRawAxis(2);
	}
	public double getAxisLStickX()
	{
		return xboxController.getRawAxis(0);
	}
	public double getAxisLStickY()
	{
		return xboxController.getRawAxis(1);
	}
	public double getAxisRStickX()
	{
		return xboxController.getRawAxis(4);
	}
	public double getAxisRStickY()
	{
		return xboxController.getRawAxis(5);
	}
	
	//POLAR
	public double getMagnitude()
	{
		return xboxController.getMagnitude();
	}
	public double getDirectionDegrees()
	{
		return xboxController.getDirectionDegrees();
	}


}