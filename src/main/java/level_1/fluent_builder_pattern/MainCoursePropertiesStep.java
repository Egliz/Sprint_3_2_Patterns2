package level_1.fluent_builder_pattern;

public interface MainCoursePropertiesStep {
    MainCoursePropertiesStep isVegan();
    MainCoursePropertiesStep isGlutenFree();

    SupplementStep withSupplement(Supplement supplement);
    DessertChoiceStep withDessert(String dessert);
}