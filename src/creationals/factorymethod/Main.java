package creationals.factorymethod;

public class Main {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new WeaponFactory();
        Weapon axe = weaponFactory.getWeapon(WeaponType.AXE);
        axe.showTitle();

        Weapon sword = weaponFactory.getWeapon(WeaponType.SWORD);
        sword.showTitle();

        Weapon spear = weaponFactory.getWeapon(WeaponType.SPEAR);
        spear.showTitle();


    }
}
