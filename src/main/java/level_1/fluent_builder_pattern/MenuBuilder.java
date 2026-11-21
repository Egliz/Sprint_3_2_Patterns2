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
    private String suplement;
    private double supplementPrice;

}
