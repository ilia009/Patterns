package factorymethod_test.factory;

import factorymethod_test.furniture.Chair;
import factorymethod_test.furniture.Furniture;

public class ChairFactory implements Factory {
    @Override
    public Furniture createFurniture() {
        return new Chair();
    }
}
