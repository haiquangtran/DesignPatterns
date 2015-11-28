package hqt.designpatterns.patterns.observer.javaexample;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private double average;
	private double max;
	private double min = Double.POSITIVE_INFINITY;
	private double total;
	private int count;
	private Observable weatherData;
	
	public StatisticsDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		// Register the observer
		weatherData.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature: " + average + " : " + max + " : " + min);
	}

	@Override
	public void update(Observable obs, Object args) {
		if (obs instanceof WeatherData) {
			count++;
			WeatherData data = (WeatherData) obs;
			this.average = (average + data.getTemperature())/count;
			this.max = Math.max(max, data.getTemperature());
			this.min = Math.min(min, data.getTemperature());
			display();
		}
	}
	
	public double getAverage() {
		return average;
	}
	
	public double getMax() {
		return max;
	}
	
	public double getMin() {
		return min;
	}

}
