package reflectionproblems.advancedreflectionproblems.customloggingproxy;

class GreetingImpl implements Greeting {
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
