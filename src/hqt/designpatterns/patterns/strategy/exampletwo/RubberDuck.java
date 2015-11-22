package hqt.designpatterns.patterns.strategy.exampletwo;

public class RubberDuck extends AbstractDuck {
	
	public RubberDuck() {
		setFlyBehaviour(new FlyNoWay());
		setQuackBehaviour(new Squeak());
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Rubber Duck!");		
	}

}
