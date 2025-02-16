package annotationsproblems.practiceproblems.beginnerproblems.markimportantmethods;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class ImportantMethodMain {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Service.class;

            for (Method method : clazz.getDeclaredMethods()) {
                if (method.isAnnotationPresent(ImportantMethod.class)) {
                    ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                    System.out.println("Important Method: " + method.getName());
                    System.out.println("Importance Level: " + annotation.level());
                    System.out.println("------------------------");
                }
            }

            // Invoke an important method dynamically
            Service service = new Service();
            Method criticalMethod = clazz.getMethod("processCriticalData");
            criticalMethod.invoke(service);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
