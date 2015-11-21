package hqt.designpatterns.patterns.strategy.exampleone;

public class AxeBehaviour implements WeaponBehaviour {

	@Override
	public void useWeapon() {
		System.out.println("I am using a axe!");		
	}

}
