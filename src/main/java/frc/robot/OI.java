/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import edu.wpi.first.wpilibj.XboxController;
//import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import frc.robot.controllers.*;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import frc.robot.Interfaces.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public final IController controller;
	// public Xbox xbox;
	// private TwoJoysticks twoJoy;

	private static final int PORT_RIGHT = 1;
	private static final int PORT_LEFT = 0;
	private static final int PORT_XBOX = 2;
	public OI() {
		// xbox = new Xbox(PORT_XBOX);
		// twoJoy = new TwoJoysticks(PORT_RIGHT, PORT_LEFT);
		// JoystickButton a = xbox.getButton(Hand.kLeft, 1);
		// JoystickButton three = twoJoy.getButton(Hand.kRight, 3);
		
		// controller = new TwoJoysticks(PORT_LEFT,PORT_RIGHT);
		controller = new Xbox(0);
	}






/*
	public JoystickButton x;
	public JoystickButton y;
	public JoystickButton a;
	public JoystickButton b;
  
	  private XboxController xbox;
  
	  private static final int PORT = 0;
	public enum XboxButtonMap{
		A(1),
		B(2),
		X(3),
		Y(4),
		LeftTrigger(5),
		RightTrigger(6),
		Windows(7),
		Select(8),
		LeftJoystick(9),
		RightJoystick(10);
		private int num;
		XboxButtonMap(int buttonNumber)
		{
			num = buttonNumber;
		}
		public int toInt()
		{
			return num;
		}
  }
	public OI() {
		// controller =
		xbox = new XboxController(PORT);
	}
	public double getLeftTrigger() {
		return xbox.getTriggerAxis(Hand.kLeft);
	}
	public double getRightTrigger() {
		return xbox.getTriggerAxis(Hand.kRight);
	}
	public double getDriveXAxisValue() {
		return xbox.getX(Hand.kLeft);
	}
	public double getDriveYAxisValue() {
		return -1 * xbox.getY(Hand.kLeft);
  }
  public double getPOV() {
    return xbox.getPOV();
  }
*/

  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
