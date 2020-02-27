package structurals.newBridge;

public class Main {

    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDev()),
                new StockExchange(new CppDev())
        };

        for (Program program: programs) {
            program.developProgram();
        }
    }
}
