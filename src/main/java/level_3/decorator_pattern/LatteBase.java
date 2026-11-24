package level_3.decorator_pattern;

public class LatteBase implements BubbleTea{

    private final double cost = 3.50;

    @Override
    public String getDescription() {
        return "Latte Base";
    }

    @Override
    public double getCost() {
        return 0;
    }
}
