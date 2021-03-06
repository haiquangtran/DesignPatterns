package hqt.designpatterns.tests;

import static org.junit.Assert.*;
import hqt.designpatterns.patterns.factory.otherfactory.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;

public class FactoryExampleTests {
	// factories
	private PizzaStore chicagoStore = new ChicagoStylePizzaStore();
	private PizzaStore newYorkStore = new NYStylePizzaStore();
	
	@Test
	public void shouldOrderChicagoCheeseTypePizza() {
		assertThat(chicagoStore.orderPizza("cheese"), instanceOf(ChicagoCheesePizza.class));
		assertEquals(chicagoStore.orderPizza("Cheese").getName(), "Chicago Style Deep Dish Cheese Pizza");
	}
	
	@Test
	public void shouldOrderChicagoClamTypePizza() {
		assertThat(chicagoStore.orderPizza("clam"), instanceOf(ChicagoClamPizza.class));
	}
	
	@Test
	public void shouldOrderNYCheeseTypePizza() {
		assertThat(newYorkStore.orderPizza("cheese"), instanceOf(NYCheesePizza.class));
		assertEquals(newYorkStore.orderPizza("Cheese").getName(), "NY Style Sauce and Cheese Pizza");
	}
	
	@Test
	public void shouldOrderNYClamTypePizza() {
		assertThat(newYorkStore.orderPizza("clam"), instanceOf(NYClamPizza.class));
	}
	

}
