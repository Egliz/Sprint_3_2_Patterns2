package level_1.fluent_builder_pattern;

public interface MenuStartStep {

    EntrantPropertiesStep withEntrant(String entrant);
    MainCoursePropertiesStep withMainCourse(String mainCourse);
}
