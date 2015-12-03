package hqt.designpatterns.patterns.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.setDescription("House Blend Coffee");
	}
	
	public double cost() {
		return .89;
	}

}
