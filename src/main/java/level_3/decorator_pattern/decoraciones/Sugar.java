package level_3.decorator_pattern.decoraciones;

import level_3.decorator_pattern.BubbleTea;
import level_3.decorator_pattern.BubbleTeaDecorator;

public class Sugar extends BubbleTeaDecorator {

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
