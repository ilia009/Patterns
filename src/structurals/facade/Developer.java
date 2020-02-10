package structurals.facade;

public class Developer {
    public void doJobBrforeDeadLine(SprintTracker sprintTracker){
        if(sprintTracker.isActiveSprint()){
            System.out.println("Developer working");
        }else {
            System.out.println("Developer play games");
        }
    }
}
