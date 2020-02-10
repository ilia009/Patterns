package creationals.fakebuilder;

public abstract class GuestHouse implements Item {

    @Override
    public Building building() {
        return new AdditionalFacility();
    }

    @Override
    public abstract int price();
}
