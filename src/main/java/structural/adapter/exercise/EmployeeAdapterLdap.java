package structural.adapter.exercise;

public class EmployeeAdapterLdap implements Employee {

    private final EmployeeLdap employeeFromLDAP;
    public EmployeeAdapterLdap(EmployeeLdap employeeFromLDAP) {
        this.employeeFromLDAP = employeeFromLDAP;
    }

    @Override
    public String getId() {
        return employeeFromLDAP.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeFromLDAP.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeFromLDAP.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeFromLDAP.getMail();
    }
}
