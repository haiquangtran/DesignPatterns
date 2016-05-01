package hqt.designpatterns.tests;

import static org.junit.Assert.*;

import java.io.PrintStream;

import hqt.designpatterns.patterns.command.*;
import hqt.designpatterns.patterns.command.exampleone.*;
import hqt.designpatterns.patterns.command.simpleexample.Command;
import hqt.designpatterns.patterns.command.simpleexample.GarageDoor;
import hqt.designpatterns.patterns.command.simpleexample.GarageDoorOpenCommand;
import hqt.designpatterns.patterns.command.simpleexample.Light;
import hqt.designpatterns.patterns.command.simpleexample.LightOnCommand;
import hqt.designpatterns.patterns.command.simpleexample.SimpleRemoteControl;
import hqt.designpatterns.patterns.decorator.*;

import org.junit.Before;
import org.junit.Test;


public class SimpleCommandExampleTests {
	private double precision = 0.0;
	private SimpleRemoteControl simpleRemote;

	@Before
	public void setUpSimpleRemoteControl() {
		simpleRemote = new SimpleRemoteControl();
	}

	/**
	 *  SIMPLE REMOTE CONTROL TESTS
	 */
	
	@Test
	public void simpleRemoteShouldTurnLightOn() {
		Light light = new Light();
		LightOnCommand command = new LightOnCommand(light);
		simpleRemote.setCommand(command);

		assertTrue("light should be off", !light.isOn());
		simpleRemote.buttonWasPressed();
		assertTrue("light should now be on", light.isOn());
	}

	@Test
	public void simpleRemoteShouldOpenGarageDoor() {
		GarageDoor garage = new GarageDoor();
		Command command = new GarageDoorOpenCommand(garage);
		simpleRemote.setCommand(command);
		assertTrue("garage closed", !garage.isOpen());
		simpleRemote.buttonWasPressed();
		assertTrue("garage open", garage.isOpen());
	}

	@Test 
	public void simpleRemoteShouldTurnOnLightsAndOpenGarageDoor() {
		GarageDoor garage = new GarageDoor();
		Light light = new Light();

		simpleRemote.setCommand(new LightOnCommand(light));
		simpleRemote.buttonWasPressed();
		assertTrue(light.isOn());

		simpleRemote.setCommand(new GarageDoorOpenCommand(garage));
		simpleRemote.buttonWasPressed();
		assertTrue(garage.isOpen());
	}
}
