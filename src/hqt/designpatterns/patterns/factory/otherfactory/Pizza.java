package hqt.designpatterns.patterns.factory.otherfactory;

import java.util.ArrayList;

public abstract class Pizza {
	private String name;
	private String dough;
	private String sauce;
	private ArrayList toppings = new ArrayList();

	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("     " + toppings.get(i));
		}
	}

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");	
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	/** Getters and Setters **/	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDough(String dough) {
		this.dough = dough;
	}
	
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	public ArrayList getToppings() {
		return toppings;
	}
	
}
