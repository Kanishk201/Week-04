package reflectionproblems.advancedreflectionproblems.jsonrepresentation;

import java.lang.reflect.Field;
import java.util.StringJoiner;

public class ObjectToJsonConverter {
    public static String toJson(Object obj) {
        try {
            Class<?> clazz = obj.getClass();
            StringJoiner json = new StringJoiner(", ", "{", "}");
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                Object value = field.get(obj);
                String formattedValue = (value instanceof String) ? "\"" + value + "\"" : String.valueOf(value);
                json.add("\"" + field.getName() + "\": " + formattedValue);
            }
            return json.toString();
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Error converting object to JSON", e);
        }
    }

    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        System.out.println("JSON Representation: " + toJson(person));
    }
}
