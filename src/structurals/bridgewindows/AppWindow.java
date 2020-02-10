package structurals.bridgewindows;


public class AppWindow extends Window {
    public AppWindow(Color color) {
        super(color);
    }
    @Override
    public void draw() {
        System.out.print("Window for desctop version with border color: ");
        color.draw();
    }
}
