package level_1.fluent_builder_pattern;

public class MenuBuilder implements BuildStep, DessertChoiceStep,
        EntrantPropertiesStep,
        EntrantStep,
        MainCourse,
        MainCoursePropertiesStep,
        SupplementStep{

    private String entrant;
    private String mainCourse;
    private String dessert;
    private String coffee;
    private String drink;
    private Supplement suplement;
    private boolean isVegan;
    private boolean isGlutenFree;
   // private double supplementPrice;


    @Override
    public BuildStep withDrink(String drink) {
        this.drink = drink;
        return this;
    }

    /*
    @Override
    public Menu build() {
        return null;
    }*/

    @Override
    public BuildStep withDessert(String dessert) {
        this.dessert = dessert;
        this.coffee = null;
        return this;
    }

    @Override
    public BuildStep withCoffee(String coffee) {
        this.coffee = coffee;
        this.dessert = null;
        return this;
    }

    @Override
    public EntrantPropertiesStep isVegan() {
        this.isVegan = true;
        return this;
    }

    @Override
    public EntrantPropertiesStep isGlutenFree() {
       this.isGlutenFree = true;
        return this;
    }

    @Override
    public SupplementStep withSupplement(Supplement supplement) {
        this.suplement = supplement;
        return this;
    }

    @Override
    public MainCoursePropertiesStep withMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
        return this;
    }

    @Override
    public EntrantPropertiesStep withEntrant(String entrant) {
        this.entrant = entrant;
        return this;
    }
}
