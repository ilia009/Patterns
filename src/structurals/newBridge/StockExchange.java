package structurals.newBridge;

public class StockExchange extends Program{

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock development..");
        developer.writeCode();
    }
}
