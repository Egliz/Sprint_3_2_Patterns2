package level_3.decorator_pattern;

public class Sugar extends BubbleTeaDecorator{

    public Sugar(BubbleTea bubbleTea) {
        super(bubbleTea);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Sugar";
    }

    @Override
    public double getCost(){
        return super.getCost() + 0.30;
    }
}
