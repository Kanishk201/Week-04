package annotationsproblems.practiceproblems.advancedproblems.customserializationannotation;


import java.util.HashMap;
import java.util.Map;
import java.lang.annotation.*;
import java.lang.reflect.Field;

class JsonSerializer {
    public static String serialize(Object object) {
        try {
            Class<?> objClass = object.getClass();
            Map<String, String> jsonMap = new HashMap<>();

            for (Field field : objClass.getDeclaredFields()) {
                if (field.isAnnotationPresent(JsonField.class)) {
                    field.setAccessible(true);
                    JsonField annotation = field.getAnnotation(JsonField.class);
                    jsonMap.put(annotation.name(), field.get(object).toString());
                }
            }

            StringBuilder jsonString = new StringBuilder("{");
            for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
                jsonString.append("\"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\", ");
            }

            if (jsonString.length() > 1) {
                jsonString.setLength(jsonString.length() - 2);
            }
            jsonString.append("}");

            return jsonString.toString();

        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
    }
}

