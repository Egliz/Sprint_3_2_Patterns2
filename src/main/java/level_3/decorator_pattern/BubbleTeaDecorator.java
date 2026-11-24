package level_3.decorator_pattern;

public abstract class BubbleTeaDecorator implements BubbleTea {

    protected BubbleTea bubbleTea;

    public BubbleTeaDecorator(BubbleTea bubbleTea) {
        this.bubbleTea = bubbleTea;
    }

    @Override
    public String getDescription(){
        return bubbleTea.getDescription();
    }



}
