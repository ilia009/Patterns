package creationals.fakebuilder;

public class WoodHouse  extends House{
    @Override
    public String name() {
        return "Wood house";
    }

    @Override
    public int price() {
        return 80;
    }
}
