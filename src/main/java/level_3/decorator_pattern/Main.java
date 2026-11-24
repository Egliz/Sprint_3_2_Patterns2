package level_3.decorator_pattern;

import level_3.decorator_pattern.decorations.Flavor;
import level_3.decorator_pattern.decorations.Ice;
import level_3.decorator_pattern.decorations.Sugar;
import level_3.decorator_pattern.decorations.Tapioca;

public class Main {
    public static void main(String[] args) {

        BubbleTea teaLatte = new LatteBase();
        teaLatte = new Ice(teaLatte);
        teaLatte = new Tapioca(teaLatte);
        teaLatte = new Sugar(teaLatte);
        teaLatte = new Flavor(teaLatte, "Mango");

        System.out.println(teaLatte.getDescription());
        System.out.println(teaLatte.getCost());
    }
}
