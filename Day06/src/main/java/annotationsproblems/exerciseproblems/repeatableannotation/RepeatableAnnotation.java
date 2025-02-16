package annotationsproblems.exerciseproblems.repeatableannotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class RepeatableAnnotation {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Software.class;
            Method method = clazz.getMethod("buggyMethod");

            // Check if the method has multiple BugReport annotations
            if (method.isAnnotationPresent(BugReports.class)) {
                BugReports reports = method.getAnnotation(BugReports.class);
                for (BugReport report : reports.value()) {
                    System.out.println("Bug: " + report.description());
                    System.out.println("Reported By: " + report.reportedBy());
                    System.out.println("------------------------");
                }
            }

            // Invoke the method
            Software software = new Software();
            method.invoke(software);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
