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

        assertEquals("Latte Bubble Tea", teaLatte.getDescription());
    }

    @Test
    public void shouldReturnLatteCost(){
        BubbleTea teaLatte = new LatteBase();

        assertEquals(3.50, teaLatte.getCost());
    }

    @Test
    public void shouldAddIceToBubbleTea(){
        BubbleTea teaMatcha = new MatchaBase();
        teaMatcha = new Ice(teaMatcha);

        assertEquals("Matcha Bubble Tea + Ice", teaMatcha.getDescription());
        assertEquals( 3.45, teaMatcha.getCost());
    }

    @Test
    public void shouldAddTapiocaToBubbleTea(){
        BubbleTea teaMatcha = new MatchaBase();
        teaMatcha = new Tapioca(teaMatcha);

        assertEquals("Matcha Bubble Tea + Tapioca", teaMatcha.getDescription());
        assertEquals( 3.70, teaMatcha.getCost());
    }

    @Test
    public void shouldAddFlavorToBubbleTea(){
        BubbleTea teaMatcha = new MatchaBase();
        teaMatcha = new Flavor(teaMatcha, "Mango");

        assertEquals("Matcha Bubble Tea + Flavor : Mango", teaMatcha.getDescription());
        assertEquals( 3.8000000000000003, teaMatcha.getCost());
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
