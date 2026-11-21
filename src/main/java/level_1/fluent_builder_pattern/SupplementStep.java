package level_1.fluent_builder_pattern;

public interface SupplementStep {

    SupplementStep withSupplement(Supplement supplement);
    DessertChoiceStep withDessert(String dessert);

}
