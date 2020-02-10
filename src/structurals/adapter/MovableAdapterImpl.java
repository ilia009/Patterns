package structurals.adapter;

public class MovableAdapterImpl implements SpeedometroAdapterForEurope {
   private Spedometro europeanCar;

    public MovableAdapterImpl(Spedometro europeanCar) {
   this.europeanCar = europeanCar;
    }

    @Override
    public double getSpeed() {
        return convertMetrics(europeanCar.getSpeed());
    }

    private double convertMetrics(double mph){
        return mph * 1.609;
    }
}
