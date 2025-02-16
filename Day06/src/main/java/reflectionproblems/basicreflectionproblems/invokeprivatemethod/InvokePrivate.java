package reflectionproblems.basicreflectionproblems.invokeprivatemethod;

import java.lang.reflect.*;


public class InvokePrivate {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true);

            int result = (int) multiplyMethod.invoke(calculator, 5, 10);
            System.out.println("Result of multiply(5, 10): " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
