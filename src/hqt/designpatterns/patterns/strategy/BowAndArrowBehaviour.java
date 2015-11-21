package hqt.designpatterns.patterns.strategy;

public class BowAndArrowBehaviour implements WeaponBehaviour {

	@Override
	public void useWeapon() {
		System.out.println("I am using a bow and arrow!");		
	}

}
