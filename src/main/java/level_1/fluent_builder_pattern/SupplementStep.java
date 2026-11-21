package level_1.fluent_builder_pattern;

public interface SupplementStep {

    SupplementStep withSupplement(Supplement supplement);
    BuildStep withDessert(String dessert);
    BuildStep withCoffee(String coffee);



}
