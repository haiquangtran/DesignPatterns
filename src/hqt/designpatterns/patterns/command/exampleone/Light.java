package hqt.designpatterns.patterns.command.exampleone;

public class Light {
	private boolean isOn;
	private String location;
	
	public Light(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setOn() {
		isOn = true;
	}
	
	public void setOff() {
		isOn = false;
	}
	
	/**
	 * for testing purposes
	 * @return
	 */
	public boolean isOn() {
		return isOn;
	}
	
}
