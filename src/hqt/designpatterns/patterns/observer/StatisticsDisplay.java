package hqt.designpatterns.patterns.observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private double average;
	private double max;
	private double min = Double.POSITIVE_INFINITY;
	private double total;
	private int count;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		// Register the observer
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature: " + average + " : " + max + " : " + min);
	}

	@Override
	public void update(double temp, double humidity, double pressure) {
		count++;
		this.average = (average + temp)/count;
		this.max = Math.max(max, temp);
		this.min = Math.min(min, temp);
		display();
	}

}
