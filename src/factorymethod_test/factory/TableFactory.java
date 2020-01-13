package factorymethod_test.factory;

import factorymethod_test.furniture.Furniture;
import factorymethod_test.furniture.Table;

public class TableFactory implements Factory{

    @Override
    public Furniture createFurniture() {
        return new Table();
    }
}
