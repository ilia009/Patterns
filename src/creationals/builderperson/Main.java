package creationals.builderperson;

public class Main {
    public static void main(String[] args) {

        Person person = Person.builder()
                .setName("name")
                .setAge(1)
                .setWeight(1)
                .build();


    }
}
