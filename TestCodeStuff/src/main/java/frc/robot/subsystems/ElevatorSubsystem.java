// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANEncoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


 

/** Add your docs here. */
public class ElevatorSubsystem extends SubsystemBase {
  CANSparkMax motor1 = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
  CANSparkMax motor2 = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
  CANEncoder Encoder = motor1.getEncoder();
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public ElevatorSubsystem(){
    motor2.follow(motor1);
    Encoder.setPosition(0);

  }
  public void setMotorSpeed(double motorSpeed){
    motor1.set(motorSpeed);
    
  }
  public void setEncoderPosition(double encoderPosition){
    Encoder.setPosition(encoderPosition);
  }
  public double getEncoderPosition(){
    return Encoder.getPosition();

  }
}
