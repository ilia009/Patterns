package abstractfactory.products;

public class SteelTable implements Furniture {
    @Override
    public void showTitle() {
        System.out.println("STEEL_TABLE");
    }
}
