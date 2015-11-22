package hqt.designpatterns.patterns.strategy.exampletwo;

public class MallardDuck extends AbstractDuck {
	
	public MallardDuck() {
		setFlyBehaviour(new FlyWithWings());
		setQuackBehaviour(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Mallard Duck!");
	}

}
