package q6;

public class SalaryStructure extends PayrollPeriod {
    protected double basicPay;
    protected double transportAllowance;
    protected double housingAllowance;

    public SalaryStructure(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                           String deptName, String deptCode, String managerName,
                           int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                           int month, int year, java.time.LocalDate startDate, java.time.LocalDate endDate,
                           double basicPay, double transportAllowance, double housingAllowance) throws PayrollException {
        super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate);
        if (basicPay < 0 || transportAllowance < 0 || housingAllowance < 0) throw new PayrollException("All pays must be ≥0");
        this.basicPay = basicPay;
        this.transportAllowance = transportAllowance;
        this.housingAllowance = housingAllowance;
    }
}
