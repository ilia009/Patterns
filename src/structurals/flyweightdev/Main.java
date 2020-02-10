package structurals.flyweightdev;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DevFactory devFactory = new DevFactory();

        List<Developer> devList = new ArrayList<>();

        devList.add(devFactory.getDevBySpec("java"));
        devList.add(devFactory.getDevBySpec("java"));
        devList.add(devFactory.getDevBySpec("java"));
        devList.add(devFactory.getDevBySpec("java"));
        devList.add(devFactory.getDevBySpec("java"));
        devList.add(devFactory.getDevBySpec("java"));
        devList.add(devFactory.getDevBySpec("c++"));
        devList.add(devFactory.getDevBySpec("c++"));
        devList.add(devFactory.getDevBySpec("c++"));
        devList.add(devFactory.getDevBySpec("c++"));
        devList.add(devFactory.getDevBySpec("c++"));

        for (Developer dev:devList) {
            dev.writeCode();

        }
    }
}
