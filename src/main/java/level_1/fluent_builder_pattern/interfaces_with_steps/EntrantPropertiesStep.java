package level_1.fluent_builder_pattern.interfaces_with_steps;

public interface EntrantPropertiesStep {
    EntrantPropertiesStep vegan();
    EntrantPropertiesStep glutenFree();

    MainCoursePropertiesStep withMainCourse(String mainCourse);
}
