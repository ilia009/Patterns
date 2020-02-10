package creationals.fakebuilder;

public class WoodGuestHouse extends GuestHouse {
    @Override
    public String name() {
        return "Wood guest house";
    }

    @Override
    public int price() {
        return 10;
    }
}
