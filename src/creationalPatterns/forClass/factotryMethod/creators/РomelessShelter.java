package creationalPatterns.forClass.factotryMethod.creators;

import creationalPatterns.forClass.factotryMethod.products.Animal;

//will create  cat or dog
public abstract class РomelessShelter {

    public void testAnimal(){

       Animal testAnimal = createAnimal();
       testAnimal.greeting();
       testAnimal.jump();
       testAnimal.run();
    }

    public abstract Animal createAnimal();
}
