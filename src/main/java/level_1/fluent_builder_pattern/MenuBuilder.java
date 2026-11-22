package level_1.fluent_builder_pattern;

public class MenuBuilder implements BuildStep,
        EntrantPropertiesStep,
        MenuStartStep,
        MainCoursePropertiesStep,
        SupplementStep,
        VeganStep,
        GlutenStep{

    private String entrant;
    private String mainCourse;
    private String dessert;
    private String coffee;
    private String drink;
    private Supplement supplement;
    private boolean vegan;
    private boolean glutenFree;

    public static MenuStartStep builder(){
        return new MenuBuilder();
    }

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
    public MenuBuilder vegan() {
        this.vegan = true;
        return this;
    }

    @Override
    public MenuBuilder glutenFree() {
       this.glutenFree = true;
        return this;
    }

    @Override
    public SupplementStep withSupplement(String name, double price) {
       supplement = new Supplement(name, price);
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

    public Supplement getSupplement() {
        return supplement;
    }

    public boolean isVegan() {
        return vegan;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }
}
