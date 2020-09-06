package tw.waterball.survive.io.server.worldobject.weapon;

import tw.waterball.survive.io.server.worldobject.WorldObject;
import tw.waterball.survive.io.server.worldobject.role.Role;

public abstract class Weapon extends WorldObject {
	private WeaponName weaponName;
	private Role weaponHolder;
	private int damage;
	private boolean isOnTheGround;

	public abstract void useWeapon();

	public void setOnTheGround(boolean onTheGround) {
		isOnTheGround = onTheGround;
	}
}