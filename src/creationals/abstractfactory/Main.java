package creationals.abstractfactory;

import creationals.abstractfactory.factories.FactoryProducer;
import creationals.abstractfactory.factories.FactoryType;
import creationals.abstractfactory.factories.FurnitureFactory;
import creationals.abstractfactory.products.Furniture;
import creationals.abstractfactory.products.FurnitureType;

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
