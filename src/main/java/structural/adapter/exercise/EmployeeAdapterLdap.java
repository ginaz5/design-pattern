package structural.adapter.exercise;

public class EmployeeAdapterLdap implements Employee {

    private final EmployeeLdap employeeFromLDAP;
    public EmployeeAdapterLdap(EmployeeLdap employeeFromLDAP) {
        this.employeeFromLDAP = employeeFromLDAP;
    }

    @Override
    public String getId() {
        return employeeFromLDAP.cn();
    }

    @Override
    public String getFirstName() {
        return employeeFromLDAP.givenName();
    }

    @Override
    public String getLastName() {
        return employeeFromLDAP.surname();
    }

    @Override
    public String getEmail() {
        return employeeFromLDAP.mail();
    }

    // adding toString method might make it similar to decorator method
    @Override
    public String toString() {
        return "EmployeeLdap{" +
                "cn='" + employeeFromLDAP.cn() + '\'' +
                ", surname='" + employeeFromLDAP.surname() + '\'' +
                ", givenName='" + employeeFromLDAP.givenName() + '\'' +
                ", mail='" + employeeFromLDAP.mail() + '\'' +
                '}';
    }
}
