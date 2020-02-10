package structurals.bridgewindows;

public class WebWindow extends Window {
    public WebWindow (Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Window for web version with border color: ");
        color.draw();
    }
}