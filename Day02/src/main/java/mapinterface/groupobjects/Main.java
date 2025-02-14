package mapinterface.groupobjects;

import java.util.*;

import static mapinterface.groupobjects.EmployeeGrouper.groupByDepartment;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR"),
                new Employee("Dave", "Finance")
        );

        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        groupedEmployees.forEach((department, empList) ->
                System.out.println(department + ": " + empList)
        );
    }
}

