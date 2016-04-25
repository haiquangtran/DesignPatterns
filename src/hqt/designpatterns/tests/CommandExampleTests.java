package hqt.designpatterns.tests;

import static org.junit.Assert.*;
import hqt.designpatterns.patterns.command.Light;
import hqt.designpatterns.patterns.command.LightOnCommand;
import hqt.designpatterns.patterns.decorator.*;

import org.junit.Test;


public class CommandExampleTests {
	private double precision = 0.0;

	@Test
	public void commandExecuteShouldTurnLightOn() {
		Light light = new Light();
		LightOnCommand command = new LightOnCommand(light);

		assertTrue("light should be off", !light.isOn());
		command.execute();
		assertTrue("light should now be on", light.isOn());
	}
	
}
