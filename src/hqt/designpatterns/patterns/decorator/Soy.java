package hqt.designpatterns.patterns.decorator;

public class Soy extends CondimentDecorator {
	private Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		double soyCost = .15; 
		return beverage.cost() + soyCost;
	}

}
