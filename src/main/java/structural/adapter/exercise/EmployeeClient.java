package structural.adapter.exercise;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        // test data of employeeDB
        Employee employeeFromDB = new EmployeeDB("1", "John", "Doe", "<EMAIL>");

        employees.add(employeeFromDB);

//        Employee employeeFromLDAP = new EmployeeLdap("666", "Solo", "Smith", "ldap@<EMAIL>");
        EmployeeLdap employeeFromLDAP = new EmployeeLdap("666", "Solo", "Smith", "ldap@<EMAIL>");
        employees.add(new EmployeeAdapterLdap(employeeFromLDAP));

        EmployeeCSV employeeCSV = new EmployeeCSV("234,testCSV,Apple,testCSV@<EMAIL>");

        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;
    }
}
