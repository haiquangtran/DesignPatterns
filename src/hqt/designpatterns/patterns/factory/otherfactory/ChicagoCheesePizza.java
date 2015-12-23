package hqt.designpatterns.patterns.factory.otherfactory;

public class ChicagoCheesePizza extends Pizza {
	
	public ChicagoCheesePizza() {
		setName("Chicago Style Deep Dish Cheese Pizza");
		setDough("Extra Thick Crust Dough");
		setSauce("Plum Tamato Sauce");
		
		getToppings().add("Shredded Mozzarella Cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the piozza into square slices");
	}

}
