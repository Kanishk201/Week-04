package reflectionproblems.advancedreflectionproblems.customloggingproxy;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();
        Greeting proxyGreeting = ProxyFactory.createProxy(greeting, Greeting.class);

        proxyGreeting.sayHello("Alice"); // Logs the method call before execution
    }
}
