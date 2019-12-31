package creationalPatterns.forClass.factotryMethod.creators;

import creationalPatterns.forClass.factotryMethod.products.Animal;
import creationalPatterns.forClass.factotryMethod.products.Dog;

public class DogShelter  extends РomelessShelter{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
