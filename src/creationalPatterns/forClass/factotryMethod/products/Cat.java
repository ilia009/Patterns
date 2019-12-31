package creationalPatterns.forClass.factotryMethod.products;

public class Cat implements Animal {
    @Override
    public void greeting() {
        System.out.println("I am cat");
    }

    @Override
    public void run() {
        System.out.println("Cat running");

    }

    @Override
    public void jump() {
        System.out.println("Cat make a jump");

    }
}
