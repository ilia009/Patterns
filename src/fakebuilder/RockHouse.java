package fakebuilder;

public class RockHouse extends House {
    @Override
    public String name() {
        return "Rock house";
    }

    @Override
    public int price() {
        return 50;
    }
}
