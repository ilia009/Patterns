package abstractfactory.factories;

import abstractfactory.furniture.FurnitureAsChair;
import abstractfactory.furniture.FurnitureAsTable;
import abstractfactory.furniture.WoodChair;
import abstractfactory.furniture.WoodTable;

public class WoodFurnitureFactory implements FurnitureFactory {
    @Override
    public FurnitureAsChair createChair() {
        return new WoodChair();
    }

    @Override
    public FurnitureAsTable createTable() {
        return new WoodTable();
    }
}
