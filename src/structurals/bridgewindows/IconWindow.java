package structurals.bridgewindows;

public class IconWindow extends Window {
    public IconWindow (Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Icon window with border color: ");
        color.draw();
    }
}