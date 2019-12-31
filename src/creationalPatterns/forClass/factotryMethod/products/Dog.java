package creationalPatterns.forClass.factotryMethod.products;

public class Dog implements Animal {
    @Override
    public void greeting() {
        System.out.println("I am dog");
    }

    @Override
    public void run() {
        System.out.println("Dog running");

    }

    @Override
    public void jump() {
        System.out.println("Dog make a jump");

    }
}
