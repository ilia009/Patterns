package abstractfactory.factories;

import abstractfactory.furniture.FurnitureAsChair;
import abstractfactory.furniture.FurnitureAsTable;

public interface FurnitureFactory {

    FurnitureAsChair createChair();
    FurnitureAsTable createTable();

}
