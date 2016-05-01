package hqt.designpatterns.patterns.command.simpleexample;

public class GarageDoorOpenCommand implements Command {
	private GarageDoor garage;

	public GarageDoorOpenCommand(GarageDoor garage) {
		this.garage = garage;
	}

	public void execute() {
		// open garage only if it's closed.
		garage.up();
	}

}
