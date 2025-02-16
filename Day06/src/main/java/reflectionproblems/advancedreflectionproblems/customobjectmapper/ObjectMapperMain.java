package reflectionproblems.advancedreflectionproblems.customobjectmapper;

import java.util.Map;

import static reflectionproblems.advancedreflectionproblems.customobjectmapper.ObjectMapper.toObject;

public class ObjectMapperMain {
    public static void main(String[] args) {
        Map<String, Object> properties = Map.of(
                "name", "John Doe",
                "age", 30
        );

        Person person = toObject(Person.class, properties);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
