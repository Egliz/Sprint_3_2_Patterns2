package level_3.decorator_pattern;

public class TeaBase implements BubbleTea{

    private final double cost = 3;


    @Override
    public String getDescription() {
        return "Tea Base";
    }

    @Override
    public double getCost() {
        return cost;
    }
}
