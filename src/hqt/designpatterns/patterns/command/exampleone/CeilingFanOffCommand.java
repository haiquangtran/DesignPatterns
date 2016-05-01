package hqt.designpatterns.patterns.command.exampleone;

public class CeilingFanOffCommand implements Command {
	private CeilingFan fan;
	
	public CeilingFanOffCommand(CeilingFan fan) {
		this.fan = fan;
	}
	
	@Override
	public void execute() {
		fan.setOff();
	}
	
}
