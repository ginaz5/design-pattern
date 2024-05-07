package structural.adapter.exercise;

import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();

        System.out.println("=== Adapter Demo ===");
        System.out.println(employees);
    }
}
