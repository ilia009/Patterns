package creationals.fakebuilder;

public class RockGuestHouse extends GuestHouse {
    @Override
    public String name() {
        return "Rock guest house";
    }

    @Override
    public int price() {
        return 5;
    }
}
