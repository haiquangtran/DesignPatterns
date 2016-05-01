package hqt.designpatterns.patterns.command.simpleexample;

/**
 * An API that is able to control various different devices
 * and interact with the different device API's without being 
 * tightly coupled with them. 
 * 
 * The Command pattern allows you to decouple the requester of an action
 * from the object that actually performs the action. So, here the requester
 * would be the remote control and the object that performs the action
 * would be an instance of one of your vendor classes (devices).
 * 
 * @author Hai
 *
 */
public class SimpleRemoteControl {
	// holds the command which will control a device
	Command slot;
	
	public SimpleRemoteControl() { }
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}

}
