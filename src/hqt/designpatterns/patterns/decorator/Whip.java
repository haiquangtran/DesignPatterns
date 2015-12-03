package hqt.designpatterns.patterns.decorator;

public class Whip extends CondimentDecorator {
	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	public double cost() {
		double whipCost = .10;
		return beverage.cost() + whipCost;
	}

}
