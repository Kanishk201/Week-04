package reflectionproblems.intermediatereflectionproblems.accessandmodifystatickey;

import java.lang.reflect.Field;

import java.lang.reflect.Field;

public class AccessModifyStatic {
    public static void main(String[] args) throws Exception {

        Class<Configuration> configClass = Configuration.class;

        Field apiKeyField = configClass.getDeclaredField("API_KEY");
        apiKeyField.setAccessible(true);

        apiKeyField.set(null, "new_secret_key");

        System.out.println("Modified API_KEY: " + Configuration.getApiKey());
    }
}
