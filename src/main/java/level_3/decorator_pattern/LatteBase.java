package level_3.decorator_pattern;

public class LatteBase implements BubbleTea{

    private final double cost = 3.50;

    @Override
    public String getDescription() {
        return "Latte Bubble Tea";
    }

    @Override
    public double getCost() {
        return cost;
    }
}
