package hqt.designpatterns.patterns.observer.javaexample;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private double temperature;
	private double humidity;
	private double pressure;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		// Register the observer
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees, " + humidity + "% humidity, and " + pressure + " barometer pressure.");
	}

	@Override
	public void update(double temp, double humidity, double pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
	
	public double getTemperature() {
		return temperature;
	}
	
	public double getHumdity() {
		return humidity;
	}
	
	public double getPressure() {
		return pressure;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
