package hqt.designpatterns.tests;

import static org.junit.Assert.*;
import hqt.designpatterns.patterns.decorator.*;

import org.junit.Test;

public class DecoratorExampleTests {
	private double precision = 0.0;

	@Test
	public void expressoCoffeeShouldCost1Dollar99Cents() {
		Beverage beverage = new Espresso();

		assertEquals(beverage.getDescription(), "Espresso");
		assertEquals("Espresso Should Cost $1.99", beverage.cost(), 1.99, precision);
	}

	@Test
	public void darkRoastCoffeeWithDoubleMochaAndWhipShouldCost1Dollar49Cents() {
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);

		assertEquals(beverage2.getDescription(), "Dark Roast Coffee, Mocha, Mocha, Whip");
		assertEquals("Dark Roast Coffee, Mocha, Mocha, Whip Should Cost $1.49", beverage2.cost(), 1.49, precision);
	}
	
	@Test
	public void houseBlendCoffeeWithSoyMochaAndWhipShouldCost1Dollar34Cents() {
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);

		assertEquals(beverage3.getDescription(), "House Blend Coffee, Soy, Mocha, Whip");
		assertEquals("House Blend Coffee, Soy, Mocha, Whip Should Cost $1.34", beverage3.cost(), 1.34, precision);
	}

}
