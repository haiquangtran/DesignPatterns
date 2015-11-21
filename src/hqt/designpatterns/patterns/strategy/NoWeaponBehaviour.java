package hqt.designpatterns.patterns.strategy;

public class NoWeaponBehaviour implements WeaponBehaviour {

	@Override
	public void useWeapon() {
		System.out.println("I am using no weapons! only my fists!");
	}

}
