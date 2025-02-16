package reflectionproblems.advancedreflectionproblems.dependencyinjection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class DIContainer {
    private final Map<Class<?>, Object> instances = new HashMap<>();

    public <T> T getInstance(Class<T> clazz) throws Exception {
        if (instances.containsKey(clazz)) {
            return clazz.cast(instances.get(clazz));
        }

        T instance = createInstance(clazz);
        instances.put(clazz, instance);
        return instance;
    }

    private <T> T createInstance(Class<T> clazz) throws Exception {
        Constructor<T> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        T instance = constructor.newInstance();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                Object dependency = getInstance(field.getType());
                field.set(instance, dependency);
            }
        }
        return instance;
    }
    public static void main(String[] args) throws Exception {
        DIContainer container = new DIContainer();
        Client client = container.getInstance(Client.class);
        client.run(); // Outputs: "Service executed!"
    }
}



