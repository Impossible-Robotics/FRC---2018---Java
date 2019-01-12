/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Spark;

public class DriveTrain extends Robot{
	
	public Spark leftMotor;
	public Spark leftBackMotor;
	public Spark rightMotor;
	public Spark rightBackMotor;
	
	public DriveTrain() {
		this.leftMotor = new Spark(RobotMap.leftMotor);
		this.leftBackMotor = new Spark(RobotMap.leftBackMotor);
		this.rightMotor = new Spark(RobotMap.rightMotor);
		this.rightBackMotor = new Spark(RobotMap.rightBackMotor);
	}
	
	public void drive(double leftJoy, double rightJoy) {
		
			leftMotor.set(-leftJoy);
			leftBackMotor.set(-leftJoy);
			rightMotor.set(rightJoy);
			rightBackMotor.set(rightJoy);
		
	}
	
	
	
}