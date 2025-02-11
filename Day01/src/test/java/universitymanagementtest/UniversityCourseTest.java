package universitymanagementtest;

import org.junit.jupiter.api.Test;
import universitycoursemanagementsystem.Course;
import universitycoursemanagementsystem.ExamCourse;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class UniversityCourseTest {
    @Test
    void testCourseAddition() {
        Course<ExamCourse> examCourse = new Course<>("Engineering");
        examCourse.addCourse(new ExamCourse("Thermodynamics"));
        assertEquals(1, examCourse.getCourses().size());
        assertEquals("Thermodynamics", examCourse.getCourses().getFirst().getCourseName());
    }
}
