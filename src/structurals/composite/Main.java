package structurals.composite;

public class Main {
    public static void main(String args[]) {
        MilitaryService missileTroops = new MissileTroops(
                1, "missile troops");
        MilitaryService tanksTroops = new TanksTroop(
                2, "tanks troops");
        MilitaryService airTroops = new AirForce(
                3, "air troops");

        MilitaryForce worldArmy = new MilitaryForce(
                0, "Army of the world");

        worldArmy.addChildArmy(missileTroops);
        worldArmy.addChildArmy(tanksTroops);
        worldArmy.addChildArmy(airTroops);

        worldArmy.printMilitaryServiceName();
    }
}
