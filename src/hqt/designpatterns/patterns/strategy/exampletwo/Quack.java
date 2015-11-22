package hqt.designpatterns.patterns.strategy.exampletwo;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Quack!");		
	}

}
