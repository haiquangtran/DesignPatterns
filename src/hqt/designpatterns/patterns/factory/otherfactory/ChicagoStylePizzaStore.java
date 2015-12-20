package hqt.designpatterns.patterns.factory.otherfactory;

public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equalsIgnoreCase("cheese")) {
			pizza = new ChicagoCheesePizza();
		} else if (type.equalsIgnoreCase("clam")) {
			pizza = new ChicagoClamPizza();
		}
		
		return pizza;
	}
	

}
