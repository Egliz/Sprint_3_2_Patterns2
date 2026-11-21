package level_1.fluent_builder_pattern;

public interface MainCoursePropertiesStep {
    MainCoursePropertiesStep vegan();
    MainCoursePropertiesStep glutenFree();

    SupplementStep withSupplement(Supplement supplement);

    BuildStep withDessert(String dessert);
    BuildStep withCoffee(String coffee);

    BuildStep withDrink(String drink);
    Menu build();
}