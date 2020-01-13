package abstractfactory;

import abstractfactory.factories.FurnitureFactory;
import abstractfactory.furniture.FurnitureAsChair;
import abstractfactory.furniture.FurnitureAsTable;

public class Logic {
    private FurnitureAsTable furnitureAsTable;
    private FurnitureAsChair furnitureAsChair;

    public Logic(FurnitureFactory furnitureFactory){
        furnitureAsChair=furnitureFactory.createChair();
        furnitureAsTable=furnitureFactory.createTable();
    }

    public void writeOnConsole(){
        System.out.println(furnitureAsTable.toString() + "\n" + furnitureAsChair.toString());

    }

}
