package mapinterfacetest.groupobjecttest;


import mapinterface.groupobjects.Employee;
import mapinterface.groupobjects.EmployeeGrouper;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeGrouperTest {

    @Test
    void testGroupByDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> grouped = EmployeeGrouper.groupByDepartment(employees);

        assertEquals(2, grouped.get("HR").size());
        assertEquals(1, grouped.get("IT").size());

    }
}
