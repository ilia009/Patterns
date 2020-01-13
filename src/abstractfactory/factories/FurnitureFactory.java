package abstractfactory.factories;

import abstractfactory.products.Furniture;
import abstractfactory.products.FurnitureType;

public abstract class FurnitureFactory {
   public abstract Furniture getFurniture(FurnitureType furnitureType);
}
