package reflectionproblems.intermediatereflectionproblems.dynamicmethodinvocation;

import java.util.Scanner;
import java.lang.reflect.*;

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter method name (add, subtract, multiply): ");
        String methodName = scanner.next();
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        MathOperations mathInstance = new MathOperations();
        Method method = MathOperations.class.getDeclaredMethod(methodName, int.class, int.class);
        int result = (int) method.invoke(mathInstance, num1, num2);

        System.out.println("Result of " + methodName + "(" + num1 + ", " + num2 + "): " + result);
    }
}
