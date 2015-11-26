package hqt.designpatterns.patterns.observer.customexample;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private double temperature;
	private double humidity;
	private double pressure;
	
	public WeatherData() {
		 observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer obs) {
		observers.add(obs);
	}

	@Override
	public void removeObserver(Observer obs) {
		observers.remove(obs);		
	}

	@Override
	public void notifyObservers() {
		for (Observer obs: observers) {
			obs.update(temperature, humidity, pressure);
		}
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
		notifyObservers();
	}

}
