package factorymethod;

import factorymethod.factory.ChairFactory;
import factorymethod.factory.Factory;
import factorymethod.factory.TableFactory;
import factorymethod.furniture.Furniture;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
    Factory chairF = new ChairFactory();
    Factory tableF = new TableFactory();

    Furniture chair = chairF.createFurniture();
    Furniture table = tableF.createFurniture();

        System.out.println(chair);
        System.out.println(table);
    }
}
