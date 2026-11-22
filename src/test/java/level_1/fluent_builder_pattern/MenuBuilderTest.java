package level_1.fluent_builder_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MenuBuilderTest {

    @Test
    void shouldCreateCompleteMenu() {
       Menu menu = MenuBuilder.builder()
                .withEntrant("Salad")
                .withMainCourse("Risotto")
                .withDessert("Chocolate cake")
                .withDrink("Water")
                .build();

        assertEquals("Salad", menu.getEntrant());
        assertEquals("Risotto", menu.getMainCourse());
        assertEquals("Chocolate cake", menu.getDessert());
        assertEquals("Water", menu.getDrink());
    }

    @Test
    void shouldCreateHalfMenu() {
        Menu menu = MenuBuilder.builder()
                .withMainCourse("Risotto")
                .withDrink("Water")
                .build();

        assertNull(menu.getEntrant());
        assertEquals("Risotto", menu.getMainCourse());
        assertNull(menu.getDessert());
        assertEquals("Water", menu.getDrink());
    }

    @Test
    void shouldCreateKidsMenu() {
        Menu menu = MenuBuilder.builder()
                .withMainCourse("Chicken nuggets")
                .withDessert("Ice cream")
                .withDrink("Orange juice")
                .build();

        assertNull(menu.getEntrant());
        assertEquals("Chicken nuggets", menu.getMainCourse());
        assertEquals("Ice cream", menu.getDessert());
        assertEquals("Orange juice", menu.getDrink());
    }

    @Test
    void shouldCreateMenuWithoutDrink() {
        Menu menu = MenuBuilder.builder()
                .withMainCourse("Risotto")
                .build();

        assertNull(menu.getDrink());
    }

    @Test
    void shouldCreateMenuWithSupplement() {
        Menu menu = MenuBuilder.builder()
                .withMainCourse("Steak")
                .withSupplement("Extra cheese", 2.50)
                .build();

        assertNotNull(menu.getSupplement());
        assertEquals("Extra cheese", menu.getSupplement().getSupplement());
        assertEquals(2.50, menu.getSupplement().getPrice());
    }

    @Test
    void shouldCreateVeganMenu() {
        Menu menu = MenuBuilder.builder()
                .withMainCourse("Vegetable risotto")
                .vegan()
                .build();

        assertTrue(menu.isVegan());
    }

    @Test
    void shouldCreateMenuWithCoffee() {
        Menu menu = MenuBuilder.builder()
                .withMainCourse("Risotto")
                .withCoffee("Espresso")
                .build();

        assertEquals("Espresso", menu.getCoffee());
        assertNull(menu.getDessert());
    }


}
