package structurals.bridgewindows;

public abstract class Window {
    protected Color color;

    protected Window(Color color){
        this.color = color;
    }

    public abstract void draw();
}
