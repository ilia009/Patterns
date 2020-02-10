package structurals.bridge;

public class Main {
    public static void main(String[] args) {
        Shape redC = new Circle(100,100,10,new RedCircle());

        redC.draw();
    }
}
