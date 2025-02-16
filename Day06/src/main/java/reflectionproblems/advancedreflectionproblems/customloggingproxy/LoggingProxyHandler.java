package reflectionproblems.advancedreflectionproblems.customloggingproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class LoggingProxyHandler implements InvocationHandler {
    private final Object target;

    public LoggingProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method called: " + method.getName());
        return method.invoke(target, args);
    }
}

