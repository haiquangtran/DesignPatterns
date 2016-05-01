package hqt.designpatterns.patterns.command.exampleone;

public class CeilingFanOnCommand implements Command{
private CeilingFan fan;
	
	public CeilingFanOnCommand(CeilingFan fan) {
		this.fan = fan;
	}
	
	@Override
	public void execute() {
		fan.setOn();
	}
	
}
