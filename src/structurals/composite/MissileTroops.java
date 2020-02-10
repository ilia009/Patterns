package structurals.composite;

public class MissileTroops implements MilitaryService {
    private Integer id;
    private String name;

    @Override
    public void printMilitaryServiceName() {
        System.out.println(getClass().getSimpleName());
    }

    public MissileTroops(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
