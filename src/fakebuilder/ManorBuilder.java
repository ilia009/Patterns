package fakebuilder;

public class ManorBuilder {

    public Manor buildWoodManor(){
        Manor woodManor = new Manor();
        woodManor.addItem(new WoodHouse());
        woodManor.addItem(new WoodGuestHouse());
        woodManor.addItem(new WoodGuestHouse());
        woodManor.addItem(new WoodGuestHouse());

        return woodManor;
    }

    public Manor buildRockManor(){
        Manor woodManor = new Manor();
        woodManor.addItem(new WoodHouse());
        woodManor.addItem(new WoodGuestHouse());
        woodManor.addItem(new WoodGuestHouse());

        return woodManor;
    }
}
