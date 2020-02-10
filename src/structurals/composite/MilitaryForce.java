package structurals.composite;

import java.util.ArrayList;
import java.util.List;

public class MilitaryForce implements MilitaryService {

    private Integer id;
    private String name;

    private List<MilitaryService> childArmy;

    public MilitaryForce(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childArmy = new ArrayList<>();
    }

    public void printMilitaryServiceName() {
        childArmy.forEach(MilitaryService::printMilitaryServiceName);
    }
    public void printMilitaryNumsOFSoldiers(){
        childArmy.forEach(MilitaryService::printMilitaryServiceName);
    }

    public void addChildArmy(MilitaryService army) {
        childArmy.add(army);
    }

    public void removeChildArmy(MilitaryService army) {
        childArmy.remove(army);
    }
}
