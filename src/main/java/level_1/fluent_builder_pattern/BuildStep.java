package level_1.fluent_builder_pattern;

public interface BuildStep {

    BuildStep withDrink(String drink);

    Menu build();
}
