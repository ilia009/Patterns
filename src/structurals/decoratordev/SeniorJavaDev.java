package structurals.decoratordev;

public class SeniorJavaDev extends DevDecorator {
    public SeniorJavaDev(Developer developer) {
        super(developer);
    }

    public String makeCodeRev(){
        return "do code review. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeRev();
    }
}
