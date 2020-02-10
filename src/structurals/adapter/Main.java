package structurals.adapter;

public class Main {
    public static void main(String[] args) {
        Spedometro europeanCar = new AmericanSportCar();
        SpeedometroAdapterForEurope adapter = new MovableAdapterImpl(europeanCar);

        System.out.println(adapter.getSpeed());

    }
}
