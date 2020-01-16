package abstractfactory.factories;

public class FactoryProducer {
    public static FurnitureFactory getFactory(FactoryType factoryType){
        switch (factoryType){
            case STEEL_FACTRY:
                return new SteelFurnitureFactory();
            case WOOD_FACTORY:
                return new WoodFurnitureFactory();
            default: return null;
        }
     }
}
