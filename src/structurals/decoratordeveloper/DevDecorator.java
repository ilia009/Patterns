package structurals.decoratordeveloper;

public class DevDecorator implements Developer{
    Developer developer;

    public DevDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
