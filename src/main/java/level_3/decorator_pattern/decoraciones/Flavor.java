package level_3.decorator_pattern.decoraciones;

import level_3.decorator_pattern.BubbleTea;
import level_3.decorator_pattern.BubbleTeaDecorator;

    public class Flavor extends BubbleTeaDecorator {

        private String flavor;

        public Flavor(BubbleTea bubbleTea, String flavor) {
            super(bubbleTea);
            this.flavor = flavor;
        }

        @Override
        public String getDescription() {
            return super.getDescription() + " Flavor : " + flavor;
        }

        @Override
        public double getCost(){
            return super.getCost() + 0.60;
        }
    }
