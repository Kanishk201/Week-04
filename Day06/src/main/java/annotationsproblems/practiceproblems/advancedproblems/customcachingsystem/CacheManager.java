package annotationsproblems.practiceproblems.advancedproblems.customcachingsystem;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class CacheManager {
    private static final Map<String, Object> cache = new HashMap<>();

    public static Object invokeWithCache(Object object, String methodName, Object... args) {
        try {
            Method method = object.getClass().getMethod(methodName, getParameterTypes(args));

            if (method.isAnnotationPresent(CacheResult.class)) {
                String cacheKey = generateCacheKey(methodName, args);

                // Check if result exists in cache
                if (cache.containsKey(cacheKey)) {
                    System.out.println("Returning cached result for: " + methodName);
                    return cache.get(cacheKey);
                }

                // Compute result and store in cache
                Object result = method.invoke(object, args);
                cache.put(cacheKey, result);
                return result;
            }

            return method.invoke(object, args);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String generateCacheKey(String methodName, Object... args) {
        StringBuilder key = new StringBuilder(methodName);
        for (Object arg : args) {
            key.append("_").append(arg.toString());
        }
        return key.toString();
    }

    private static Class<?>[] getParameterTypes(Object... args) {
        return java.util.Arrays.stream(args)
                .map(Object::getClass)
                .toArray(Class<?>[]::new);
    }
}

