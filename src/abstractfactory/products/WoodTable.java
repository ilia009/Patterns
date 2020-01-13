package abstractfactory.products;

public class WoodTable implements Furniture {
    @Override
    public void showTitle() {
        System.out.println("WOOD_TABLE");
    }
}
