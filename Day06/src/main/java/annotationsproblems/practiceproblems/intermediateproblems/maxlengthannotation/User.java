package annotationsproblems.practiceproblems.intermediateproblems.maxlengthannotation;


import java.lang.reflect.Field;

class User {

    @MaxLength(10)  // Username cannot exceed 10 characters
    private String username;

    public User(String username) {
        validateMaxLength(username);
        this.username = username;
    }

    // Step 3: Validate the Field Length Using Reflection
    private void validateMaxLength(String value) {
        try {
            for (Field field : this.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(MaxLength.class)) {
                    MaxLength annotation = field.getAnnotation(MaxLength.class);
                    int maxLength = annotation.value();
                    if (value.length() > maxLength) {
                        throw new IllegalArgumentException(
                                "Error: " + field.getName() + " exceeds max length of " + maxLength + " characters"
                        );
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}
