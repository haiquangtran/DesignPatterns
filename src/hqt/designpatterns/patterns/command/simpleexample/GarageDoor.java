package hqt.designpatterns.patterns.command.simpleexample;

public class GarageDoor {
	private Light light = new Light();
	private boolean isOpen = false;
			
	public void up() {
		// garage door is down (closed)
		if (!isOpen) {
			isOpen = true;
		}
	}
	
	public void down() {
		// garage door is up (open)
		if (isOpen) {
			isOpen = false;
		}
	} 
	
	public void lightOn() {
		light.on();
	}
	
	public void lightOff() {
		light.off();
	}
	
	public Light getLight() {
		return light;
	}
	
	public boolean isOpen() {
		return isOpen;
	}

}
