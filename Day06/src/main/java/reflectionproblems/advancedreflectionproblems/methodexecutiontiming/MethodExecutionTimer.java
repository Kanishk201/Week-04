package reflectionproblems.advancedreflectionproblems.methodexecutiontiming;

import java.lang.reflect.Method;

public class MethodExecutionTimer {
    public static void main(String[] args) {
        try {
            Class<?> clazz = SampleClass.class;
            Object obj = clazz.getDeclaredConstructor().newInstance();

            for (Method method : clazz.getDeclaredMethods()) {
                if (method.getParameterCount() == 0) { // Ensuring only no-arg methods are invoked
                    long startTime = System.nanoTime();
                    method.invoke(obj);
                    long endTime = System.nanoTime();

                    System.out.println("Execution time of " + method.getName() + ": "
                            + (endTime - startTime) / 1_000_000 + " ms");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}