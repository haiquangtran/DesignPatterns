package hqt.designpatterns.patterns.strategy.exampleone;

public class KnifeBehaviour implements WeaponBehaviour {

	@Override
	public void useWeapon() {
		System.out.println("I am using a knife!");
	}

}
