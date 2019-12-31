package creationalPatterns.forClass.factotryMethod.creators;

import creationalPatterns.forClass.factotryMethod.products.Animal;
import creationalPatterns.forClass.factotryMethod.products.Cat;

public class CatShelter extends РomelessShelter {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
