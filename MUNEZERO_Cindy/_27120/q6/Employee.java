package q6;

public class Employee extends Department {
    protected int employeeID;
    protected String fullName;
    protected String position;
    protected double baseSalary;
    protected boolean rssbRegistered;

    public Employee(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                    String deptName, String deptCode, String managerName,
                    int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered)
            throws PayrollException {
        super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName);
        if (employeeID < 1000) throw new PayrollException("Employee ID must be ≥1000");
        if (baseSalary <= 0) throw new PayrollException("Base salary must be >0");
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.position = position;
        this.baseSalary = baseSalary;
        this.rssbRegistered = rssbRegistered;
    }
}
