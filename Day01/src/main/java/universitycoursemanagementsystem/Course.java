package universitycoursemanagementsystem;

import java.util.List;
import java.util.ArrayList;

public class Course<T extends CourseType> {
    private String department;
    private List<T> courses = new ArrayList<>();

    public Course(String department) {
        this.department = department;
    }

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }

    public String getDepartment() {
        return department;
    }

}
