package hqt.designpatterns.patterns.strategy.exampletwo;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Squeak!");
	}

}
