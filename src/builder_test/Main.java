package builder_test;

public class Main {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMealWithCoke();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Cost: "+ vegMeal.getCost());

        System.out.println();

        Meal regularMeal = mealBuilder.prepareRegularMealWithPepsi();
        System.out.println("Regular Meal");
        regularMeal.showItems();
        System.out.println("Cost: "+ regularMeal.getCost());
    }
}
