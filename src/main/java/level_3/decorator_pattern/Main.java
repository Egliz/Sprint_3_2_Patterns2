package level_3.decorator_pattern;

import level_3.decorator_pattern.decoraciones.Sugar;
import level_3.decorator_pattern.decoraciones.Tapioca;

public class Main {
    public static void main(String[] args) {

        BubbleTea teaLatte = new LatteBase();
        teaLatte = new Tapioca(teaLatte);
        teaLatte = new Sugar(teaLatte);

        System.out.println(teaLatte.getDescription());
        System.out.println(teaLatte.getCost());
    }
}
