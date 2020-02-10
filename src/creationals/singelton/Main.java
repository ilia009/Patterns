package creationals.singelton;

public class Main {
    public static void main(String[] args) {
        God god = God.getInstance();

        System.out.println(god.name + "\n" + god.numsOfFolovers);

    }
}
