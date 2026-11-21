package level_1.fluent_builder_pattern;

public class MenuBuilder implements BuildStep,
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
    private Supplement supplement;
    private boolean vegan;
    private boolean glutenFree;
   // private double supplementPrice;


    @Override
    public BuildStep withDrink(String drink) {
        this.drink = drink;
        return this;
    }


    @Override
    public Menu build() {
        return new Menu(this);
    }

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
    public EntrantPropertiesStep vegan() {
        this.vegan = true;
        return this;
    }

    @Override
    public EntrantPropertiesStep glutenFree() {
       this.glutenFree = true;
        return this;
    }

    @Override
    public SupplementStep withSupplement(Supplement supplement) {
        this.supplement = supplement;
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

    public Supplement getSuplement() {
        return supplement;
    }

    public boolean isVegan() {
        return vegan;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }
}
