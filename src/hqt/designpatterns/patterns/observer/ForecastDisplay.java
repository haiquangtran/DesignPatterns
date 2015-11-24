package hqt.designpatterns.patterns.observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private double pressure;
	private String forecast;
	private Subject weatherData;
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		// Register the observer
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Forecast: " + forecast);
	}

	@Override
	public void update(double temp, double humidity, double pressure) {
		if (pressure > this.pressure) {
			this.forecast = "Improving weather on the way!";
		} else if (pressure < this.pressure) {
			this.forecast = "Watch out for cooler, rainy weather";
		} else {
			this.forecast = "More of the same";
		}
		
		this.pressure = pressure;
		display();
	}

	public double getPressure() {
		return pressure;
	}
}
