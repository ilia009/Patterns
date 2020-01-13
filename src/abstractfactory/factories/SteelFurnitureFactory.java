package abstractfactory.factories;

import abstractfactory.furniture.FurnitureAsChair;
import abstractfactory.furniture.FurnitureAsTable;
import abstractfactory.furniture.SteelChair;
import abstractfactory.furniture.SteelTable;

public class SteelFurnitureFactory implements FurnitureFactory {
    @Override
    public FurnitureAsChair createChair() {
        return new SteelChair();
    }

    @Override
    public FurnitureAsTable createTable() {
        return new SteelTable();
    }
}
