package hqt.designpatterns.patterns.factory.otherfactory;

public class NYCheesePizza extends Pizza {
	public NYCheesePizza() {
		setName("NY Style Sauce and Cheese Pizza");
		setDough("Thin Crust Dough");
		setSauce("Marinara Sauce");
		
		getToppings().add("Grated Reggiano Cheese");
	}
	
}
