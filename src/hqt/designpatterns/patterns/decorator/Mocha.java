package hqt.designpatterns.patterns.decorator;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	public double cost() {
		double mochaCost = .20;
		return beverage.cost() + mochaCost;
	}

}
