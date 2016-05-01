package hqt.designpatterns.patterns.command.exampleone;

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
public class RemoteControl {
	private Command[] onCommands;
	private Command[] offCommands;

	public RemoteControl() {
		int size = 4;
		this.onCommands = new Command[size]; 
		this.offCommands = new Command[size]; 

		// initialize
		for (int i = 0; i < size; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		this.onCommands[slot].execute();
	}

	public void offButtonWasPushed(int slot) {
		this.offCommands[slot].execute();
	}

	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------- Remote Control ---------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "]   " + onCommands[i].getClass().getName() 
					+ "     " + offCommands[i].getClass().getName() + "\n");
		}
		
		return stringBuff.toString();
	}

}
