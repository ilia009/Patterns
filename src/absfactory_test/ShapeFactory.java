package absfactory_test;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(ShapeType shapeType) {
       if(shapeType.equals(ShapeType.RECTANGLE)){
        return new Rectangle();
       }else if(shapeType.equals(ShapeType.SQUARE)){
           return new Square();
       }
        return null;
    }
}
