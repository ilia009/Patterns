package structurals.flyweightdev;

import java.util.HashMap;
import java.util.Map;

public class DevFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDevBySpec(String spec) {
        Developer developer = developers.get(spec);

        if (developer == null) {
            switch (spec) {
                case "java":
                    System.out.println("take jave developer ");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Take c++ developer");
                    developer = new CppDeveloper();
            }
            developers.put(spec, developer);
        }
        return developer;
    }
}
