package hqt.designpatterns.patterns.command.exampleone;

public class StereoOnWithCDCommand implements Command {
	private Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		stereo.setOn();
		stereo.setCD(new CD("Justin Bieber"));
		stereo.setVolume(11);
	}

}
