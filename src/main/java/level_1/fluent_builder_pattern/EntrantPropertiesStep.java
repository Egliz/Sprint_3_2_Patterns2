package level_1.fluent_builder_pattern;

public interface EntrantPropertiesStep {
    EntrantPropertiesStep vegan();
    EntrantPropertiesStep glutenFree();

    MainCoursePropertiesStep withMainCourse(String mainCourse);
}
