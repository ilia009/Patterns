package creationals.abstractfactory.factories;

import creationals.abstractfactory.products.Furniture;
import creationals.abstractfactory.products.FurnitureType;
import creationals.abstractfactory.products.WoodChair;
import creationals.abstractfactory.products.WoodTable;

public class WoodFurnitureFactory extends FurnitureFactory {
    @Override
   public Furniture getFurniture(FurnitureType furnitureType) {
        switch (furnitureType){
            case TABLE:
                return new WoodTable();
            case CHAIR:
                return new WoodChair();
            default: return null;
        }
     }
}
