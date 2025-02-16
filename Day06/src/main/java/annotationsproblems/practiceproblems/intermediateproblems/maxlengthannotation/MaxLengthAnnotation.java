package annotationsproblems.practiceproblems.intermediateproblems.maxlengthannotation;


public class MaxLengthAnnotation {
    public static void main(String[] args) {
        try {
            User validUser = new User("Alice123"); // Valid case
            System.out.println("User created: " + validUser.getUsername());

            User invalidUser = new User("VeryLongUsername"); // Invalid case, should throw exception
            System.out.println("User created: " + invalidUser.getUsername());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
