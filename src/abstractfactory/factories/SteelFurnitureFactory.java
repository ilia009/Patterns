package abstractfactory.factories;

import abstractfactory.products.Furniture;
import abstractfactory.products.FurnitureType;
import abstractfactory.products.SteelChair;
import abstractfactory.products.SteelTable;


public class SteelFurnitureFactory extends FurnitureFactory {
    FurnitureType furnitureType;


    @Override
  public   Furniture getFurniture(FurnitureType furnitureType) {
        //switch-case or if-else?
        switch (furnitureType){
            case CHAIR:
                return new SteelChair();
            case TABLE:
                return new SteelTable();
        }
        return null;
    }
}
