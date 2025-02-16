package annotationsproblems.exerciseproblems.customannotation;

public class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Alice")
    public void completeTask() {
        System.out.println("Completing a high-priority task...");
    }
}
