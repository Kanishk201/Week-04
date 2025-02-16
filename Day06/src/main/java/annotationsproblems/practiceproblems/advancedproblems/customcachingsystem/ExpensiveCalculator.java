package annotationsproblems.practiceproblems.advancedproblems.customcachingsystem;

class ExpensiveCalculator {

    @CacheResult
    public long factorial(int n) {
        System.out.println("Computing factorial of " + n + "...");
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }
}

