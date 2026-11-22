package level_1.fluent_builder_pattern;

public class Menu {
    private final String entrant;
    private final String mainCourse;
    private final String dessert;
    private final String coffee;
    private final String drink;
    private final Supplement supplement;
    //private final double supplementPrice;
    private final boolean isVegan;
    private final boolean isGlutenFree;


    public Menu(MenuBuilder menuBuilder) {
        this.entrant = menuBuilder.getEntrant();
        this.mainCourse = menuBuilder.getMainCourse();
        this.dessert = menuBuilder.getDessert();
        this.coffee = menuBuilder.getCoffee();
        this.drink = menuBuilder.getDrink();
        this.supplement = menuBuilder.getSupplement();
        this.isVegan = menuBuilder.isVegan();
        this.isGlutenFree = menuBuilder.isGlutenFree();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "entrant='" + entrant + '\'' +
                ", mainCourse='" + mainCourse + '\'' +
                ", dessert='" + dessert + '\'' +
                ", coffe='" + coffee + '\'' +
                ", drink='" + drink + '\'' +
                ", suplement=" + supplement +
                ", isVegan=" + isVegan +
                ", isGlutenFree=" + isGlutenFree +
                '}';
    }

    public String getEntrant() {
        return entrant;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public String getDessert() {
        return dessert;
    }

    public String getCoffee() {
        return coffee;
    }

    public String getDrink() {
        return drink;
    }

    public Supplement getSupplement() {
        return supplement;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }
}
