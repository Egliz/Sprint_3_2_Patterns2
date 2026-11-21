package level_1.fluent_builder_pattern;

public class Menu {
    private final String entrant;
    private final String mainCourse;
    private final String dessert;
    private final String coffe;
    private final String drink;


    private Menu(MenuBuilder menuBuilder) {
        this.entrant = menuBuilder.entrant;
        this.mainCourse = menuBuilder.mainCourse;
        this.dessert = menuBuilder.dessert;
        this.coffe = menuBuilder.coffee;
        this.drink = menuBuilder.drink;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "entrant='" + entrant + '\'' +
                ", mainCourse='" + mainCourse + '\'' +
                ", dessert='" + dessert + '\'' +
                ", coffe='" + coffe + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
