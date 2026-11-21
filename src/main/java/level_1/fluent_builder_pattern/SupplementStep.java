package level_1.fluent_builder_pattern;

public interface SupplementStep {

    SupplementStep withSupplement(String name, double price);
    BuildStep withDessert(String dessert);
    BuildStep withCoffee(String coffee);



}
