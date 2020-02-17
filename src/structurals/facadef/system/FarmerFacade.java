package structurals.facadef.system;

public class FarmerFacade {
    Farmer farmer = new Farmer();
    WeatherChecker weatherChecker = new WeatherChecker();

    public void cultivateTheLand() {
        weatherChecker.startRaining();
        farmer.doJobBeforeRain(weatherChecker);
        System.out.println();
        weatherChecker.finishRaining();
        farmer.doJobBeforeRain(weatherChecker);


    }
}
