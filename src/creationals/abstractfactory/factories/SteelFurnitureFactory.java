package creationals.abstractfactory.factories;

import creationals.abstractfactory.products.Furniture;
import creationals.abstractfactory.products.FurnitureType;
import creationals.abstractfactory.products.SteelChair;
import creationals.abstractfactory.products.SteelTable;


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
            default:
                return null;
        }
    }
}
