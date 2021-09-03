// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.RobotContainer;

public class TurnCommand extends CommandBase {
  public TurnCommand() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    addRequirements(RobotContainer.m_ElevatorSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  public void initialize() {}

  // Called repeatedly when this Command is scheduled to run
  @Override
  public void execute() {
    // 2pi = circumference
    // 3 feet = 36 inches
    // 36/2pi = revolutions = 18/pi

    if(RobotContainer.m_ElevatorSubsystem.getEncoderPosition() <= 18/Math.PI){
      RobotContainer.m_ElevatorSubsystem.setMotorSpeed(.2);
    }
    

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  public void end(boolean interrupted) {
    RobotContainer.m_ElevatorSubsystem.setMotorSpeed(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  
}