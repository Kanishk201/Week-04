package universitycoursemanagementsystem;

import java.util.List;

class UniversityCourseManager {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}

