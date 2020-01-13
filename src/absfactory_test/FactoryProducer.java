package absfactory_test;

public class FactoryProducer {
    public static AbstractFactory getFactory(FactoryType factoryType) { //rewrite to switch+ enum

        switch (factoryType) {
            case REGULAR:
                return new ShapeFactory();
             case ROUNDED:
                return new RoundedShapeFactory();
         }
        return null;
    }
}
