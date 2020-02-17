package structurals.facadef.system;

public class WeatherChecker {
    private boolean isRaining;

    public boolean isRaining() {
        return isRaining;
    }

    public void startRaining() {
        System.out.println("Raining, farmer can not do a job");
        isRaining = true;
    }


    public void finishRaining() {
        System.out.println("There is no raining, Farmer should go on work");
        isRaining = false;
    }

}
