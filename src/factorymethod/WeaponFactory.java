package factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class WeaponFactory {

    public static final Map<WeaponType, Supplier<Weapon>> weaponByType = new HashMap<>();

    public WeaponFactory() {
        weaponByType.put(WeaponType.AXE, Axe::new);
        weaponByType.put(WeaponType.SPEAR, Spear::new);
        weaponByType.put(WeaponType.SWORD, Sword::new);
    }

    public Weapon getWeapon(WeaponType weaponType) {
        return weaponByType.get(weaponType).get();
    }
}
