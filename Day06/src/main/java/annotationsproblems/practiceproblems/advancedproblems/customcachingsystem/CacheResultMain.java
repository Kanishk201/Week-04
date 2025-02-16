package annotationsproblems.practiceproblems.advancedproblems.customcachingsystem;

public class CacheResultMain {
    public static void main(String[] args) {
        ExpensiveCalculator calculator = new ExpensiveCalculator();

        System.out.println("Factorial of 5: " + CacheManager.invokeWithCache(calculator, "factorial", 5));

        System.out.println("Factorial of 5: " + CacheManager.invokeWithCache(calculator, "factorial", 5));

        System.out.println("Factorial of 6: " + CacheManager.invokeWithCache(calculator, "factorial", 6));
    }
}
