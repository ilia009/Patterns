package factorymethod_test;

import factorymethod_test.factory.ChairFactory;
import factorymethod_test.factory.Factory;
import factorymethod_test.factory.TableFactory;
import factorymethod_test.furniture.Furniture;

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
