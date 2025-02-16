package reflectionproblems.advancedreflectionproblems.methodexecutiontiming;

class SampleClass {
    public void methodOne() {
        try {
            Thread.sleep(500); // Simulating execution time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodTwo() {
        try {
            Thread.sleep(1000); // Simulating execution time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
