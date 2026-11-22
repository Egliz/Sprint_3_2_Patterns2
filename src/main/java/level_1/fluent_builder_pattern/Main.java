package level_1.fluent_builder_pattern;

public class Main {
    public static void main(String[] args) {

        Menu executiveMenu = MenuBuilder.builder()
                .withEntrant("Mediterranean salad")
                .vegan()
                .glutenFree()
                .withMainCourse("Beef steak")
                .withSupplement("Extra side dish", 4.6)
                .withDessert("Chocolate mousse")
                .withDrink("Red wine")
                .build();

        Menu halfMenu = MenuBuilder.builder()
                .withMainCourse("Rissoto")
                .glutenFree().
                build();
               // .withCoffee("Espresso")
                //.withDrink("Water")
                //.build();

        System.out.println(executiveMenu + "\n" + halfMenu);
    }
}