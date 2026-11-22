package level_1.fluent_builder_pattern;

public class Main {
    public static void main(String[] args) {

        Menu menu1 = MenuBuilder.builder()
                .withEntrant("ll")
                .vegan()
                .glutenFree()
                .withMainCourse("kjj")
                .withSupplement("algo", 2.4)
                .withCoffee("cafe")
                .withDrink("bebdida")
                .build();

        Menu menuInf = MenuBuilder.builder()
                .withMainCourse("kd")
                .withSupplement("jkj", 8.9)
                .withCoffee("kk")
                .withDrink("oo")
                .build();

        Menu menuInf2 = MenuBuilder.builder()
                .withMainCourse("dd")
                .glutenFree()
                .withDessert("kk")
                .withDrink("kk")
                .build();

        Menu menu3 = MenuBuilder.builder()
                .withEntrant("d")
                .withMainCourse("ll")
                .withDrink("l")
                .build();
    }
}