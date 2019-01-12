package frc.robot;

import edu.wpi.first.wpilibj.Spark;

public class Gripper{

    private Spark leftMotor;
    private Spark rightMotor;
    
    public Gripper(int motor1, int motor2) {
        
        leftMotor = new Spark(motor1);
        rightMotor = new Spark(motor2);

    }

    public void intake(){

        leftMotor.set(0.5);
        rightMotor.set(-0.5);
    
    }

    public void outtake(){

        leftMotor.set(-0.5);
        rightMotor.set(0.5);

    }

    public void stop(){

        leftMotor.set(0);
        rightMotor.set(0);
    }

}