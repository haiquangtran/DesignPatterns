package hqt.designpatterns.patterns.decorator;

public class Espresso extends Beverage {

	public Espresso() {
		this.setDescription("Espresso");
	}
	
	public double cost() {
		return 1.99;
	}

}
