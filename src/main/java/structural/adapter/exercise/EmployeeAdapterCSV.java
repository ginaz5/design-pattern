package structural.adapter.exercise;

public class EmployeeAdapterCSV implements Employee {

    private final EmployeeCSV employeeFromCSV;
    public EmployeeAdapterCSV(EmployeeCSV employeeCSV) {
        this.employeeFromCSV = employeeCSV;
    }

    @Override
    public String getId() {
        return String.valueOf(employeeFromCSV.getId());
    }

    @Override
    public String getFirstName() {
        return employeeFromCSV.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeFromCSV.getLastName();
    }

    @Override
    public String getEmail() {
        return employeeFromCSV.getEmailAddress();
    }
}
