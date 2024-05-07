package structural.adapter.exercise;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        // test data of employeeDB
        Employee employeeFromDB = new EmployeeDB("1", "John", "Doe", "<EMAIL>");

        employees.add(employeeFromDB);

        // Now we deal with data from LDAP, and the code below is not working
//        Employee employeeFromLDAP = new EmployeeLdap("666", "Solo", "Smith", "ldap@<EMAIL>");


        // csv adapter
        EmployeeCSV employeeCSV = new EmployeeCSV("3,testCSV,Apple,test_CSV@<EMAIL>");
        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;
    }
}
