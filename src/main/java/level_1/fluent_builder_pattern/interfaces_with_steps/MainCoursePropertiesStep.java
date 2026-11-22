package level_1.fluent_builder_pattern.interfaces_with_steps;

import level_1.fluent_builder_pattern.Menu;

public interface MainCoursePropertiesStep {
    MainCoursePropertiesStep vegan();
    MainCoursePropertiesStep glutenFree();

    SupplementStep withSupplement(String name, double price);

    BuildStep withDessert(String dessert);
    BuildStep withCoffee(String coffee);

    BuildStep withDrink(String drink);
    Menu build();
}