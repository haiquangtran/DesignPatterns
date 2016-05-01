package hqt.designpatterns.patterns.command.simpleexample;

public class Light {
	private boolean status = false;
	
	public boolean isOn() {
		return status;
	}
	
	public void on() {
		status = true;
	}
	
	public void off() {
		status = false;
	}
	
}
