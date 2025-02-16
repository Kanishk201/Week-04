package annotationsproblems.practiceproblems.beginnerproblems.todoannotation;

class ProjectTasks {

    @Todo(task = "Implement user authentication", assignedTo = "Alice", priority = "HIGH")
    public void userAuthentication() {
        System.out.println("User authentication module.");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDatabase() {
        System.out.println("Optimizing database queries.");
    }

    @Todo(task = "Enhance UI responsiveness", assignedTo = "Charlie", priority = "LOW")
    public void improveUI() {
        System.out.println("Improving UI responsiveness.");
    }
}
