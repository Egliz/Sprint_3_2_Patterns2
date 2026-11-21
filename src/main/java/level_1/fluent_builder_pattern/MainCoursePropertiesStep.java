package level_1.fluent_builder_pattern;

public interface MainCoursePropertiesStep {
    MainCoursePropertiesStep isVegan();
    MainCoursePropertiesStep isGlutenFree();

    SupplementStep withSupplement(Supplement supplement);

    DessertChoiceStep withDessert(String dessert);
    DessertChoiceStep withCoffee(String coffee);

    BuildStep withDrink(String drink);
    Menu build();
}