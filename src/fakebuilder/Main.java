package fakebuilder;

public class Main {
    public static void main(String[] args) {
        ManorBuilder manorBuilder = new ManorBuilder();

        Manor woodManor = manorBuilder.buildWoodManor();
        System.out.println("Wood manor");
        System.out.println("Show all facilities: " + "\n");
        woodManor.showItems();

        System.out.println();

        Manor rockManor = manorBuilder.buildRockManor();
        System.out.println("Rock manor");
        System.out.println("Show all facilities: " + "\n");
        rockManor.showItems();


    }
}
