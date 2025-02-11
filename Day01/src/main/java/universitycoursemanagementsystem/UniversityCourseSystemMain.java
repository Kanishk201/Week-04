package universitycoursemanagementsystem;

public class UniversityCourseSystemMain {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>("Computer Science");
        examCourses.addCourse(new ExamCourse("Data Structures"));
        examCourses.addCourse(new ExamCourse("Algorithms"));

        Course<AssignmentCourse> assignmentCourses = new Course<>("Mathematics");
        assignmentCourses.addCourse(new AssignmentCourse("Linear Algebra"));
        assignmentCourses.addCourse(new AssignmentCourse("Calculus"));

        Course<ResearchCourse> researchCourses = new Course<>("Physics");
        researchCourses.addCourse(new ResearchCourse("Quantum Mechanics"));
        researchCourses.addCourse(new ResearchCourse("Astrophysics"));

        System.out.println("Exam-Based Courses:");
        UniversityCourseManager.displayCourses(examCourses.getCourses());

        System.out.println("\nAssignment-Based Courses:");
        UniversityCourseManager.displayCourses(assignmentCourses.getCourses());

        System.out.println("\nResearch-Based Courses:");
        UniversityCourseManager.displayCourses(researchCourses.getCourses());
    }
}
