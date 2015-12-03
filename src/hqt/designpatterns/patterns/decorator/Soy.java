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
		switch (beverage.getSize()) {
		case TALL:
			return beverage.cost() + .10;
		case GRANDE:
			return beverage.cost() + .15;
		case VENTI:
			return beverage.cost() + .20;
		default:
			return beverage.cost();
		}
	}

}
