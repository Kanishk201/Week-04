package reflectionproblems.basicreflectionproblems.accessprivatefield;

import java.lang.reflect.*;


public class AccessPrivateMain {
    public static void main(String[] args) {
        try {
            Person person = new Person(25);
            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true);

            System.out.println("Original Age: " + ageField.get(person));
            ageField.set(person, 30);
            System.out.println("Updated Age: " + ageField.get(person));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
