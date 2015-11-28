package hqt.designpatterns.patterns.observer.javaexample;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private double pressure;
	private String forecast;
	private Observable weatherData;
	
	public ForecastDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		// Register the observer
		weatherData.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Forecast: " + forecast);
	}

	@Override
	public void update(Observable obs, Object arg1) {
		if (obs instanceof WeatherData) {
			WeatherData data = (WeatherData) obs;
			if (data.getPressure() > this.pressure) {
				this.forecast = "Improving weather on the way!";
			} else if (data.getPressure() < this.pressure) {
				this.forecast = "Watch out for cooler, rainy weather";
			} else {
				this.forecast = "More of the same";
			}		
			this.pressure = data.getPressure();
			display();	
		}
	}

	public double getPressure() {
		return pressure;
	}

}
