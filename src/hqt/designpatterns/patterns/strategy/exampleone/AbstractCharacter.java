package hqt.designpatterns.patterns.strategy.exampleone;

public abstract class AbstractCharacter {
	private WeaponBehaviour weapon = new NoWeaponBehaviour();

	public void fight() {
		weapon.useWeapon();
	}
	
	public void setWeapon(WeaponBehaviour weapon) {
		this.weapon = weapon;
	}
	
	public WeaponBehaviour getWeapon() {
		return weapon;
	}
	
}
