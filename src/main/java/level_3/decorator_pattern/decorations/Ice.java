package level_3.decorator_pattern.decorations;

import level_3.decorator_pattern.BubbleTea;
import level_3.decorator_pattern.BubbleTeaDecorator;

public class Ice extends BubbleTeaDecorator {

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
