package level_1.fluent_builder_pattern.interfaces_with_steps;

import level_1.fluent_builder_pattern.Menu;

public interface BuildStep {

    BuildStep withDrink(String drink);
    Menu build();
}
