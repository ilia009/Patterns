package factorymethod.factory;

import factorymethod.furniture.Chair;
import factorymethod.furniture.Furniture;

public class ChairFactory implements Factory {
    @Override
    public Furniture createFurniture() {
        return new Chair();
    }
}
