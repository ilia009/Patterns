package factory_method;

public class WeaponFactory {

    public Weapon getWeapon(WeaponType weaponType){
        switch (weaponType){
            case AXE:
                return new Axe();
            case SPEAR:
                return new Spear();
            case SWORD:
                return new Sword();
        }
        return null;
    }
}
