package structurals.facadef.system;

public class Farmer {

    public void doJobBeforeRain(WeatherChecker weatherChecker) {
        if (!weatherChecker.isRaining()) {
            System.out.println("Farmer working");
        } else {
            System.out.println("Farmer stay inside home");
        }
    }

}
