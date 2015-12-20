package hqt.designpatterns.patterns.factory.otherfactory;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equalsIgnoreCase("cheese")) {
			pizza = new NYCheesePizza();
		} else if (type.equalsIgnoreCase("clam")) {
			pizza = new NYClamPizza();
		}

		return pizza;
	}

}
