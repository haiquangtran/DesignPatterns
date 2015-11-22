package hqt.designpatterns.patterns.strategy.exampletwo;

public class ModelDuck extends AbstractDuck {

	public ModelDuck() {
		setFlyBehaviour(new FlyNoWay());
		setQuackBehaviour(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Model Duck!");
	}

}
