package absfactory_test;

public class Main {
     public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.REGULAR);
        Shape shape1 = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape1.draw();
        Shape shape2 = shapeFactory.getShape(ShapeType.SQUARE);
        shape2.draw();

        //get rounded shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(FactoryType.ROUNDED);
        //get an object of Shape Rectangle
        Shape shape3 = shapeFactory1.getShape(ShapeType.RECTANGLE);
        shape3.draw();
        //get an object of Shape Square
        Shape shape4 = shapeFactory1.getShape(ShapeType.SQUARE);
        shape4.draw();

    }

}
