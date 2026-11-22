package level_1.fluent_builder_pattern.interfaces_with_steps;

public interface MenuStartStep {

    EntrantPropertiesStep withEntrant(String entrant);
    MainCoursePropertiesStep withMainCourse(String mainCourse);
}
