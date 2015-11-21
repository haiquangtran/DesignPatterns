package hqt.designpatterns.patterns.strategy;

public class SwordBehaviour implements WeaponBehaviour {

	@Override
	public void useWeapon() {
		System.out.println("I am using a sword!");
	}

}
