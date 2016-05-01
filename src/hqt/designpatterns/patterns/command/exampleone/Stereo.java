package hqt.designpatterns.patterns.command.exampleone;

public class Stereo {
	private boolean isOn;
	private String location;
	private int volume = 0;
	private CD cd;
	
	public Stereo(String location) {
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
	
	public void setCD(CD cd) {
		this.cd = cd;
	}
	
	public void setVolume(int vol) {
		this.volume = vol;
	}
	
	public String getLocation() {
		return location;
	}
}
