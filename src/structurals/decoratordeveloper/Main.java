package structurals.decoratordeveloper;

public class Main {
    public static void main(String[] args) {
        Developer dev = new JavaDev();
        Developer seniorDev = new SeniorJavaDev(new JavaDev());
        Developer teamLead = new TeamLead(new SeniorJavaDev(new JavaDev()));

        System.out.println("Developer"+ dev.makeJob());
        System.out.println("Senior developer" + seniorDev.makeJob());
        System.out.println("Teamlead"+teamLead.makeJob());


    }
}
