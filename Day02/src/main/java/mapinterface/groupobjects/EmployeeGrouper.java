package mapinterface.groupobjects;

import java.util.*;

public class EmployeeGrouper {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> groupedEmployees = new HashMap<>();

        for (Employee employee : employees) {
            groupedEmployees.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>()).add(employee);
        }

        return groupedEmployees;
    }
}