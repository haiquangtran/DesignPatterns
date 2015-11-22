package hqt.designpatterns.patterns.strategy.exampletwo;

public class MuteQuack implements QuackBehaviour {
	
	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

}
