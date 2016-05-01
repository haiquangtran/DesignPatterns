package hqt.designpatterns.patterns.command.exampleone;

public class Light {
	private boolean isOn;
	
	public void setOn() {
		isOn = true;
	}
	
	public void setOff() {
		isOn = false;
	}
}
