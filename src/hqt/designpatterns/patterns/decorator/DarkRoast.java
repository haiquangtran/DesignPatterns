package hqt.designpatterns.patterns.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		this.setDescription("Dark Roast Coffee");
	}
	
	public double cost() {
		return .99;
	}
}
