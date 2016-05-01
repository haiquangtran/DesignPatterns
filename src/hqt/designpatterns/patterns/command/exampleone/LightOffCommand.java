package hqt.designpatterns.patterns.command.exampleone;

public class LightOffCommand implements Command {
	private Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.setOff();
	}

}
