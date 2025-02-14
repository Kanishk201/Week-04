package javastreams.serialization;
import java.io.ObjectOutputStream;
import java.util.*;
import java.io.*;

public class EmployeeSerializationMain {
    private static final String FILE_NAME = "source1.txt";

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000));
        employees.add(new Employee(2, "Bob", "IT", 60000));
        employees.add(new Employee(3, "Charlie", "Finance", 55000));

        serializeEmployees(employees);
        deserializeEmployees();
    }

    private static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Employees have been serialized.");
        } catch (IOException e) {
            System.out.println("An error occurred during serialization: " + e.getMessage());
        }
    }

    private static void deserializeEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            List<Employee> employees = (List<Employee>) ois.readObject();
            System.out.println("Deserialized Employees:");
            employees.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization: " + e.getMessage());
        }
    }
}
