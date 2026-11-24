package level_3.decorator_pattern;

public class MatchaBase implements BubbleTea{

    private final double cost = 3.20;


    @Override
    public String getDescription() {
        return "Matcha Bubble Tea";
    }

    @Override
    public double getCost() {
        return cost;
    }
}
