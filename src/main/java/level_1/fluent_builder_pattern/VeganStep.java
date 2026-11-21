package level_1.fluent_builder_pattern;

public interface VeganStep {

    GlutenStep glutenFree();
    Menu build();
}
