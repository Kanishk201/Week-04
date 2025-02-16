package annotationsproblems.practiceproblems.advancedproblems.customserializationannotation;

public class JsonSerializationMain {
    public static void main(String[] args) {
        User user = new User("Alice123", "alice@example.com", 25);
        String jsonOutput = JsonSerializer.serialize(user);
        System.out.println(jsonOutput);
    }
}
