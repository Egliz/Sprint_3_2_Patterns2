package level_3.decorator_pattern.decoraciones;


import level_3.decorator_pattern.BubbleTea;
import level_3.decorator_pattern.BubbleTeaDecorator;

public class Tapioca extends BubbleTeaDecorator {

    public Tapioca(BubbleTea bubbleTea) {
        super(bubbleTea);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Tapioca";
    }

    @Override
    public double getCost(){
        return super.getCost() + 0.50;
    }
}
