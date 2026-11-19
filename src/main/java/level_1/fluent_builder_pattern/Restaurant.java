package level_1.fluent_builder_pattern;

public class Restaurant {

    private final String entrant;
    private final String mainCourse;
    private final String dessert;
    private final String drink;


    private Restaurant(Menu menuBuilder){
        this.entrant = menuBuilder.entrant;
        this.mainCourse = menuBuilder.mainCourse;
    }

    public interface Entrant{
        MainCourse withEntrant(String entrant);

    }

    public static class Menu implements Entrant, {
        private String entrant;
    }
}
