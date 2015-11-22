package hqt.designpatterns.patterns.strategy.exampletwo;

public class RedHeadDuck extends AbstractDuck {
	
	public RedHeadDuck() {
		setFlyBehaviour(new FlyWithWings());
		setQuackBehaviour(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Red Head Duck!");
	}

}
