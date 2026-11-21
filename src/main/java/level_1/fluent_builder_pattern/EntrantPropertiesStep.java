package level_1.fluent_builder_pattern;

public interface EntrantPropertiesStep {
    EntrantPropertiesStep isVegan();
    EntrantPropertiesStep isGlutenFree();

    MainCoursePropertiesStep withMainCourse(String mainCourse);
}
