package hqt.designpatterns.patterns.decorator;

public class Decaf extends Beverage {

	public Decaf() {
		this.setDescription("Decaf");
	}
	
	public double cost() {
		return 1.05;
	}

}
