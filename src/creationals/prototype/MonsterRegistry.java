package creationals.prototype;

import java.util.Hashtable;

public class MonsterRegistry {

    private  static Hashtable<String, Monster> monstersMap = new Hashtable<>();

    public static Monster getMonster(String monsterTitle){
        Monster cahedMonster = monstersMap.get(monsterTitle);
        return (Monster) cahedMonster.clone();
    }

    public static void loadCache() {
        BlueMonster blueMonster = new BlueMonster();
        blueMonster.setTitle("blue");
        blueMonster.setDamage(30);
        monstersMap.put(blueMonster.getTitle(), blueMonster);

        RedMonster redMonster = new RedMonster();
        redMonster.setTitle("red");
        redMonster.setDamage(55);
        monstersMap.put(redMonster.getTitle(), redMonster);


    }
}
