package annotationsproblems.practiceproblems.beginnerproblems.todoannotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class TodoAnnotation {
    public static void main(String[] args) {
        try {
            Class<?> clazz = ProjectTasks.class;

            for (Method method : clazz.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Todo.class)) {
                    Todo todo = method.getAnnotation(Todo.class);
                    System.out.println("Pending Task: " + todo.task());
                    System.out.println("Assigned To: " + todo.assignedTo());
                    System.out.println("Priority: " + todo.priority());
                    System.out.println("Method: " + method.getName());
                    System.out.println("------------------------");
                }
            }

            ProjectTasks tasks = new ProjectTasks();
            Method taskMethod = clazz.getMethod("userAuthentication");
            taskMethod.invoke(tasks);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
