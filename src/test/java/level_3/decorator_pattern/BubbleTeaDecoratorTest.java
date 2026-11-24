package level_3.decorator_pattern;

import level_3.decorator_pattern.decoraciones.Ice;
import level_3.decorator_pattern.decoraciones.Sugar;
import level_3.decorator_pattern.decoraciones.Flavor;
import level_3.decorator_pattern.decoraciones.Tapioca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleTeaDecoratorTest {

    @Test
    public void shouldReturnLatteDescription(){
        BubbleTea teaLatte = new LatteBase();
        String result = teaLatte.getDescription();

        assertEquals("Latte Bubble Tea", result);
    }

    @Test
    public void shouldReturnLatteCost(){
        BubbleTea teaLatte = new LatteBase();
        double result = teaLatte.getCost();

        assertEquals(3.50, result);
    }

    @Test
    public void shouldAddIceToBubbleTea(){
        BubbleTea teaMatcha = new MatchaBase();
        teaMatcha = new Ice(teaMatcha);

        String descriptionResult = teaMatcha.getDescription();
        double costResult = teaMatcha.getCost();

        assertEquals("Matcha Bubble Tea + Ice", descriptionResult);
        assertEquals( 3.45, costResult);
    }

    @Test
    public void shouldAddTapiocaToBubbleTea(){
        BubbleTea teaMatcha = new MatchaBase();
        teaMatcha = new Tapioca(teaMatcha);

        String descriptionResult = teaMatcha.getDescription();
        double costResult = teaMatcha.getCost();

        assertEquals("Matcha Bubble Tea + Tapioca", descriptionResult);
        assertEquals( 3.70, costResult);
    }

    @Test
    public void shouldAddFlavorToBubbleTea(){
        BubbleTea teaMatcha = new MatchaBase();
        teaMatcha = new Flavor(teaMatcha, "Mango");

        String descriptionResult = teaMatcha.getDescription();
        double costResult = teaMatcha.getCost();

        assertEquals("Matcha Bubble Tea + Flavor : Mango", descriptionResult);
        assertEquals( 3.8000000000000003, costResult);
    }

    @Test
    public void shouldCombineMultipleDecorators(){
        BubbleTea teaLatte = new LatteBase();
        teaLatte = new Ice(teaLatte);
        teaLatte = new Tapioca(teaLatte);
        teaLatte = new Sugar(teaLatte);
        teaLatte = new Flavor(teaLatte, "Mango");

        assertEquals("Latte Bubble Tea + Ice + Tapioca + Sugar + Flavor : Mango", teaLatte.getDescription());
        assertEquals( 5.1499999999999995, teaLatte.getCost());
    }

    @Test
    public void shouldNotModifyOriginalBubbleTeaWhenDecorated(){
        BubbleTea latte = new LatteBase();
        BubbleTea decoratedTea = new Ice(latte);

        assertEquals(3.50, latte.getCost());
        assertEquals(3.75, decoratedTea.getCost());
    }

}
