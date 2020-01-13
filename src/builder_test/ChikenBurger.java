package builder_test;

public class ChikenBurger extends Burger {
    @Override
    public String name() {
        return "Chiken Burger";
    }

    @Override
    public float price() {
        return 70.8f;
    }
}
