package abstractfactory.factories;

import abstractfactory.products.Furniture;
import abstractfactory.products.FurnitureType;
import abstractfactory.products.WoodChair;
import abstractfactory.products.WoodTable;

public class WoodFurnitureFactory extends FurnitureFactory {
    @Override
   public Furniture getFurniture(FurnitureType furnitureType) {
        switch (furnitureType){
            case TABLE:
                return new WoodTable();
            case CHAIR:
                return new WoodChair();
        }
        return null;
    }
}
