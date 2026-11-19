package level_1.fluent_builder_pattern;

public class Supplement {

    private final String supplement;
    private final double price;

    public Supplement(String supplement, double price) {
        this.supplement = supplement;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Supplement{" +
                "supplement='" + supplement + '\'' +
                ", price=" + price +
                '}';
    }
}
