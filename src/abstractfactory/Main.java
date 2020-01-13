package abstractfactory;

import abstractfactory.factories.FurnitureFactory;
import abstractfactory.factories.SteelFurnitureFactory;
import abstractfactory.factories.WoodFurnitureFactory;

public class Main {
    private static Logic someLogic() {
        Logic app;
        FurnitureFactory factory;

//
//            factory = new SteelFurnitureFactory();
//            app = new Logic(factory);

            factory = new WoodFurnitureFactory();
            app = new Logic(factory);

        return app;
    }

    public static void main(String[] args) {
        Logic app = someLogic();
        app.writeOnConsole();
    }

}
