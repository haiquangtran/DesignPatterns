package hqt.designpatterns.tests;

import static org.junit.Assert.*;
import hqt.designpatterns.patterns.command.*;
import hqt.designpatterns.patterns.command.LightOnCommand;
import hqt.designpatterns.patterns.command.SimpleRemoteControl;
import hqt.designpatterns.patterns.decorator.*;

import org.junit.Test;


public class CommandExampleTests {
	private double precision = 0.0;

	@Test
	public void remoteShouldTurnLightOn() {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand command = new LightOnCommand(light);
		remote.setCommand(command);
		
		assertTrue("light should be off", !light.isOn());
		remote.buttonWasPressed();;
		assertTrue("light should now be on", light.isOn());
	}
	
}
