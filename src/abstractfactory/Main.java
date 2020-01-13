package abstractfactory;

import abstractfactory.factories.FactoryProducer;
import abstractfactory.factories.FactoryType;
import abstractfactory.factories.FurnitureFactory;
import abstractfactory.products.Furniture;
import abstractfactory.products.FurnitureType;

public class Main {

    public static void main(String[] args) {
        //call woodfactory
        FurnitureFactory woodFurnitureFactory = FactoryProducer.getFactory(FactoryType.WOOD_FACTORY);
        Furniture woodChair = woodFurnitureFactory.getFurniture(FurnitureType.CHAIR);
        woodChair.showTitle();
        Furniture woodTable = woodFurnitureFactory.getFurniture(FurnitureType.TABLE);
        woodTable.showTitle();

        //call steelfactory
        FurnitureFactory steelFurnitureFactory = FactoryProducer.getFactory(FactoryType.STEEL_FACTRY);
        Furniture steelChair = steelFurnitureFactory.getFurniture(FurnitureType.CHAIR);
        steelChair.showTitle();
        Furniture steelTable = steelFurnitureFactory.getFurniture(FurnitureType.TABLE);
        steelTable.showTitle();
    }
}
