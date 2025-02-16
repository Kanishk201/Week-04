package reflectionproblems.basicreflectionproblems.dynamicallycreateobjects;

import java.lang.reflect.*;

public class DynamicObjects {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Student.class;
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            Object studentInstance = constructor.newInstance();

            System.out.println("Dynamically created Student instance: " + studentInstance.getClass().getName());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
