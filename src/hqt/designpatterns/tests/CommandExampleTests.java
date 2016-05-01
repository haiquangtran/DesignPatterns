package hqt.designpatterns.tests;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;

import hqt.designpatterns.patterns.command.*;
import hqt.designpatterns.patterns.command.exampleone.*;
import hqt.designpatterns.patterns.decorator.*;

import org.junit.Before;
import org.junit.Test;


public class CommandExampleTests {
	private RemoteControl remoteControl;

	@Before
	public void setUpRemoteControl() {
		remoteControl = new RemoteControl();
	}

	/**
	 * REMOTE CONTROL TESTS
	 */
	
	@Test
	public void remoteControlSlot1ShouldTurnLivingRoomLightOnAndOff() {
		int slot = 0;
		// Other existing API
		Light light = new Light("Living Room");
		// Commands interfacing with the existing API's 
		LightOnCommand onCommandSlot = new LightOnCommand(light);
		LightOffCommand offCommandSlot = new LightOffCommand(light);
		// slot 1
		remoteControl.setCommand(slot, onCommandSlot, offCommandSlot);
		
		remoteControl.onButtonWasPushed(slot);
		assertTrue("light should now be on", light.isOn());
		remoteControl.offButtonWasPushed(slot);
		assertTrue("light should now be off", light.isOn());
		assertEquals("Light should be in the living room", "Living Room", light.getLocation());
	}
	
	@Test
	public void remoteControlSlot2ShouldTurnLivingRoomStereoOnAndOff() {
		int slot = 1;
		// Other existing API
		Stereo stereo = new Stereo("Living Room");
		// Commands interfacing with the existing API's 
		StereoOnWithCDCommand onCommandSlot = new StereoOnWithCDCommand(stereo);
		StereoOffCommand offCommandSlot = new StereoOffCommand(stereo);
		// slot 2
		remoteControl.setCommand(slot, onCommandSlot, offCommandSlot);
		
		remoteControl.onButtonWasPushed(slot);
		assertTrue("stereo should now be on playing a CD", stereo.isOn());
		remoteControl.offButtonWasPushed(slot);
		assertTrue("stereo should now be off", stereo.isOn());
		assertEquals("Stereo should be in the living room", "Living Room", stereo.getLocation());
	}

	@Test
	public void remoteControlSlot3ShouldTurnLivingRoomCeilingFanOnAndOff() {
		int slot = 2;
		// Other existing API
		CeilingFan fan = new CeilingFan("Living Room");
		// Commands interfacing with the existing API's 
		CeilingFanOnCommand onCommandSlot = new CeilingFanOnCommand(fan);
		CeilingFanOffCommand offCommandSlot = new CeilingFanOffCommand(fan);
		// slot 3
		remoteControl.setCommand(slot, onCommandSlot, offCommandSlot);
		
		remoteControl.onButtonWasPushed(slot);
		assertTrue("fan should now be on", fan.isOn());
		remoteControl.offButtonWasPushed(slot);
		assertTrue("fan should now be off", fan.isOn());
		assertEquals("Fan should be in the living room", "Living Room", fan.getLocation());
	}

	@Test
	public void remoteControlSlot4ShouldTurnKitchenLightOnAndOff() {
		int slot = 3;
		// Other existing API
		Light light = new Light("Kitchen");
		// Commands interfacing with the existing API's 
		LightOnCommand onCommandSlot = new LightOnCommand(light);
		LightOffCommand offCommandSlot = new LightOffCommand(light);
		// slot 4
		remoteControl.setCommand(slot, onCommandSlot, offCommandSlot);
		
		remoteControl.onButtonWasPushed(slot);
		assertTrue("light should now be on", light.isOn());
		remoteControl.offButtonWasPushed(slot);
		assertTrue("light should now be off", light.isOn());
		assertEquals("Light should be in the Kitchen", "Kitchen", light.getLocation());
	}
}
