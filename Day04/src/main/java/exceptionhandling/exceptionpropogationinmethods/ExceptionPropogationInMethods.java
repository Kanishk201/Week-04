package exceptionhandling.exceptionpropogationinmethods;
import java.io.*;
import java.util.*;

public class ExceptionPropogationInMethods {
    public static void method1() {
        throw new ArithmeticException("10 / 0");
    }

    public static void method2() {
        method1();
    }

    public static void exceptionPropogationInMethods() {
        try {
                method2();
        } catch (ArithmeticException e) {
                System.out.println("Handled exception in main");
            }
        }

}
