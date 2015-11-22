package hqt.designpatterns.patterns.strategy.exampletwo;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I can't fly!");	
	}

}
