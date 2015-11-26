package hqt.designpatterns.patterns.observer.javaexample;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
	private double temperature;
	private double humidity;
	private double pressure;

	/**
	 * This is a PULL MODEL of the OBSERVER PATTERN	
	 */
	public WeatherData() {
	}

	public double getTemperature() {
		return temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public double getPressure() {
		return pressure;
	}

	public void setMeasurements(double temp, double humidity, double pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure; 
		// Notify observers
		measurementsChanged();
	}

	public void measurementsChanged() { 
		// This is required for the observer from java package
		setChanged();
		// We aren't sending a data object with the nofiy method, hence this is a pull method
		notifyObservers();
	}

}
