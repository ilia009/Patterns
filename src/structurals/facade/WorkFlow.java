package structurals.facade;

public class WorkFlow {
    Developer dev = new Developer();
    Job job = new Job();
    SprintTracker sprintTracker = new SprintTracker();

    public void solveProblems(){
        job.doJob();
        sprintTracker.startSprint();
        dev.doJobBrforeDeadLine(sprintTracker);
        System.out.println();
        sprintTracker.finishtSprint();
        dev.doJobBrforeDeadLine(sprintTracker);



    }
}
