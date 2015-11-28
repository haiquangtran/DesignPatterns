package hqt.designpatterns.patterns.observer.javaexample;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private double temperature;
	private double humidity;
	private double pressure;
	private Observable weatherData;
	
	public CurrentConditionsDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		// Register the observer
		weatherData.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees, " + humidity + "% humidity, and " + pressure + " barometer pressure.");
	}

	@Override
	public void update(Observable obs, Object args) {
		if (obs instanceof WeatherData) {
			WeatherData data = (WeatherData) obs;
			this.temperature = data.getTemperature();
			this.humidity = data.getHumidity();
			this.pressure = data.getPressure();
			display();	
		}
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

}
