package creationals.prototype;

public class Main {
    public static void main(String[] args) {
        MonsterRegistry.loadCache();

        Monster clonedMonster1 =   MonsterRegistry.getMonster("blue");
        clonedMonster1.roar();

        Monster clonedMonster2 = MonsterRegistry.getMonster("red");
        clonedMonster2.roar();

    }
}
