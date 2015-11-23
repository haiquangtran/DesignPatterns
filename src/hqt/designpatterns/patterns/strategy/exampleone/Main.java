package hqt.designpatterns.patterns.strategy.exampleone;

public class Main {

	/**
	 * Strategy Pattern.
	 * 
	 * Design Principle: Favor Composition over Inheritance. 
	 * Composition is more flexible and allows change behavior at runtime. 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractCharacter bob = new King();
		
		bob.fight();
		
	}

}
