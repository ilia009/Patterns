package creationals.abstractfactory.factories;

import creationals.abstractfactory.products.Furniture;
import creationals.abstractfactory.products.FurnitureType;

public abstract class FurnitureFactory {
   public abstract Furniture getFurniture(FurnitureType furnitureType);
}
