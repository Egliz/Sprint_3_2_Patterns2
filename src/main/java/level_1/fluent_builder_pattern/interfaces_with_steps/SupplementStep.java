package level_1.fluent_builder_pattern.interfaces_with_steps;

import level_1.fluent_builder_pattern.Menu;

public interface SupplementStep {

    SupplementStep withSupplement(String name, double price);
    BuildStep withDessert(String dessert);
    BuildStep withCoffee(String coffee);

    Menu build();



}
