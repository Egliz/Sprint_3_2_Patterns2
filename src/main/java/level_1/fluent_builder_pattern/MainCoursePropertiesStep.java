package level_1.fluent_builder_pattern;

public interface MainCoursePropertiesStep {
    GlutenStep vegan();
    MainCoursePropertiesStep glutenFree();

    SupplementStep withSupplement(String name, double price);

    BuildStep withDessert(String dessert);
    BuildStep withCoffee(String coffee);

    BuildStep withDrink(String drink);
    Menu build();
}