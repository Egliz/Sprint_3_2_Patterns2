package level_3.decorator_pattern;

public class Ice extends BubbleTeaDecorator{

    public Ice(BubbleTea bubbleTea) {
        super(bubbleTea);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Ice";
    }

    @Override
    public double getCost(){
        return super.getCost() + 0.25;
    }
}
