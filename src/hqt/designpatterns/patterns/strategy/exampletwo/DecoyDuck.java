package hqt.designpatterns.patterns.strategy.exampletwo;

public class DecoyDuck extends AbstractDuck {
	public DecoyDuck() {
		setFlyBehaviour(new FlyNoWay());
		setQuackBehaviour(new MuteQuack());
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Decoy Duck!");
	}

}
