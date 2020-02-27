package structurals.decoratordev;

public class TeamLead extends DevDecorator{
    public TeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "do teamlead activities ";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+ sendWeekReport();
    }
}
