package hqt.designpatterns.patterns.strategy.exampletwo;

public class FlyRocketPoweredBehaviour implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");		
	}

}
