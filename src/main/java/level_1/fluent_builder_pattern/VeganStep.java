package level_1.fluent_builder_pattern;

public interface VeganStep {

    GlutenStep isGlutenFree();
    Menu build();
}
