package singelton;

public class God {

    private static God instance;
    public String name;
    long numsOfFolovers;

    private  God(){
name = "God";
    numsOfFolovers = 100500;
    }

    public static God getInstance(){
        if(instance == null){
            instance = new God();
        }
        return instance;
    }
}
