package hqt.designpatterns.patterns.command.exampleone;

public class CeilingFan {
	private boolean isOn;
	private String location;
	
	public CeilingFan(String location) {
		this.location = location;
	}
	
	public void setOn() {
		isOn = true;
	}
	
	public void setOff() {
		isOn = false;
	}

	public boolean isOn() {
		return isOn;
	}
	
	public String getLocation() {
		return location;
	}
	
}
