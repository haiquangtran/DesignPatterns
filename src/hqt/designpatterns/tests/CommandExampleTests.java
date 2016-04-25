package hqt.designpatterns.tests;

import static org.junit.Assert.*;

import java.io.PrintStream;

import hqt.designpatterns.patterns.command.*;
import hqt.designpatterns.patterns.decorator.*;

import org.junit.Before;
import org.junit.Test;


public class CommandExampleTests {
	private double precision = 0.0;
	private SimpleRemoteControl remote;

	@Before
	public void setUpSimpleRemoteControl() {
		remote = new SimpleRemoteControl();
	}

	@Test
	public void remoteShouldTurnLightOn() {
		Light light = new Light();
		LightOnCommand command = new LightOnCommand(light);
		remote.setCommand(command);

		assertTrue("light should be off", !light.isOn());
		remote.buttonWasPressed();
		assertTrue("light should now be on", light.isOn());
	}

	@Test
	public void remoteShouldOpenGarageDoor() {
		GarageDoor garage = new GarageDoor();
		remote.setCommand(new GarageDoorOpenCommand(garage));
		assertTrue("light should be off", !garage.isOpen());
		remote.buttonWasPressed();;
		assertTrue("light should now be on", garage.isOpen());
	}

	@Test 
	public void remoteShouldTurnOnLightsAndOpenGarageDoor() {
		GarageDoor garage = new GarageDoor();
		Light light = new Light();
		
		remote.setCommand(new LightOnCommand(light);
		remote.buttonWasPressed();
		assertTrue(light.isOn());

		remote.setCommand(new GarageOpenCommand(garage));
		remote.buttonWasPressed();
		assertTrue(garage.isOpen());
	}

}
