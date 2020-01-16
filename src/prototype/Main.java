package prototype;

public class Main {
    public static void main(String[] args) {
        CashedMonsters.loadCache();

        Monster clonedMonster1 =   CashedMonsters.getMonster("blue");
        clonedMonster1.roar();

        Monster clonedMonster2 = CashedMonsters.getMonster("red");
        clonedMonster2.roar();

    }
}
