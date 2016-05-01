package hqt.designpatterns.tests;

import static org.junit.Assert.*;

import java.io.PrintStream;

import hqt.designpatterns.patterns.command.*;
import hqt.designpatterns.patterns.command.simpleexample.Command;
import hqt.designpatterns.patterns.command.simpleexample.GarageDoor;
import hqt.designpatterns.patterns.command.simpleexample.GarageDoorOpenCommand;
import hqt.designpatterns.patterns.command.simpleexample.Light;
import hqt.designpatterns.patterns.command.simpleexample.LightOnCommand;
import hqt.designpatterns.patterns.command.simpleexample.SimpleRemoteControl;
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
		Command command = new GarageDoorOpenCommand(garage);
		remote.setCommand(command);
		assertTrue("garage closed", !garage.isOpen());
		remote.buttonWasPressed();
		assertTrue("garage open", garage.isOpen());
	}

	@Test 
	public void remoteShouldTurnOnLightsAndOpenGarageDoor() {
		GarageDoor garage = new GarageDoor();
		Light light = new Light();
		
		remote.setCommand(new LightOnCommand(light));
		remote.buttonWasPressed();
		assertTrue(light.isOn());

		remote.setCommand(new GarageDoorOpenCommand(garage));
		remote.buttonWasPressed();
		assertTrue(garage.isOpen());
	}

}
