package structurals.bridgewindows;

public class Main {

    public static void main(String[] args) {
        Window window = new AppWindow(new RedColor());
        window.draw();

        Window window1 = new IconWindow(new BlueColor());
        window1.draw();
    }
}
