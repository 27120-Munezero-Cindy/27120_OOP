package q3;

public class Employee extends Employer {
    private String employeeName;
    private double salary;
    private String employeeTIN;

    public Employee(int id, String createdDate, String updatedDate,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact,
                    String employeeName, double salary, String employeeTIN) throws TaxDataException {
        super(id, createdDate, updatedDate, tin, taxpayerName, address, employerName, employerTIN, contact);
        if(salary <= 0) throw new TaxDataException("Salary must be > 0");
        if(!employeeTIN.matches("\\d{9}")) throw new TaxDataException("Employee TIN must be 9 digits");
        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeTIN = employeeTIN;
    }

    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    public String getEmployeeTIN() { return employeeTIN; }
}
