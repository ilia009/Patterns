package absfactory_test;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeType shapeType){
        if(shapeType.equals(ShapeType.RECTANGLE)){
            return new RoundedRectangle();
        }else if(shapeType.equals(ShapeType.SQUARE)){
            return new RoundedSquare();
        }
        return null;
    }
}
