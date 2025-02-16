package reflectionproblems.advancedreflectionproblems.customloggingproxy;


import java.lang.reflect.Proxy;

class ProxyFactory {
    @SuppressWarnings("unchecked")
    public static <T> T createProxy(T target, Class<T> interfaceType) {
        return (T) Proxy.newProxyInstance(
                interfaceType.getClassLoader(),
                new Class<?>[]{interfaceType},
                new LoggingProxyHandler(target)
        );
    }
}
