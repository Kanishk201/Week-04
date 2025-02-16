package annotationsproblems.exerciseproblems.customannotation;


import java.lang.reflect.Method;

public class CustomAnnotation {
    public static void main(String[] args) {
        try {
            Class<?> clazz = TaskManager.class;
            Method method = clazz.getMethod("completeTask");

            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
                System.out.println("Task Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            }


            TaskManager manager = new TaskManager();
            method.invoke(manager);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
