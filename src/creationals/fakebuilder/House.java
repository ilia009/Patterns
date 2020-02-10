package creationals.fakebuilder;

public abstract class House implements Item {

    @Override
    public Building building() {
        return new MainFacility();
    }

    @Override
    public abstract int price() ;
}
