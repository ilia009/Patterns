package factorymethod.factory;

import factorymethod.furniture.Furniture;
import factorymethod.furniture.Table;

public class TableFactory implements Factory{

    @Override
    public Furniture createFurniture() {
        return new Table();
    }
}
