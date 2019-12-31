package creationalPatterns.forClass.factotryMethod;

import creationalPatterns.forClass.factotryMethod.creators.CatShelter;
import creationalPatterns.forClass.factotryMethod.creators.DogShelter;
import creationalPatterns.forClass.factotryMethod.creators.РomelessShelter;

import java.util.Scanner;

public class FactoryMethod {
    private static РomelessShelter pomelessShelter;

    public static  void main (String[] args){
        config();
        runLogic();
    }

    static void config(){
        try{
            Scanner in = new Scanner(System.in);

            System.out.println("You want cat or dog?");
            String s = in. nextLine();

            if (s.equalsIgnoreCase("cat")){
                pomelessShelter = new CatShelter();
            }
            else if (s.equalsIgnoreCase("dog")){
                pomelessShelter = new DogShelter();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static void runLogic(){
        pomelessShelter.testAnimal();
    }

}
