package hqt.designpatterns.patterns.observer.customexample;

public class Main {

	/**
	 * Observer Pattern
	 * 
	 * Defines a one-to-many dependency between objects so that 
	 * when one object changes state, all of its dependents are 
	 * notified and updated automatically. 
	 * 
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		// simulate new weather measurements
		weatherData.setMeasurements(80, 65, 30.4);
		weatherData.setMeasurements(82, 70, 29.2);
		weatherData.setMeasurements(78, 90, 29.2);
	}

}
