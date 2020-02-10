package structurals.facade;

public class SprintTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }
    public void startSprint(){
        System.out.println("Sprint is active");
        activeSprint = true;
    }


    public void finishtSprint(){
        System.out.println("Sprint is not active");
        activeSprint = false;
    }
}
