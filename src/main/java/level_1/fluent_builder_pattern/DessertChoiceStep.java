package level_1.fluent_builder_pattern;

public interface DessertChoiceStep {

    BuildStep withDessert(String dessert);
    BuildStep withCoffee();
}
