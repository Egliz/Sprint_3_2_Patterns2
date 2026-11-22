package level_1.fluent_builder_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


}
