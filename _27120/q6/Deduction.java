package q6;

public class Deduction extends SalaryStructure {
    protected double rssbContribution; // 5% of basicPay
    protected double payeTax;
    protected double loanDeduction;

    public Deduction(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                     String deptName, String deptCode, String managerName,
                     int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                     int month, int year, java.time.LocalDate startDate, java.time.LocalDate endDate,
                     double basicPay, double transportAllowance, double housingAllowance,
                     double payeTax, double loanDeduction) throws PayrollException {
        super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance);
        if (payeTax < 0 || loanDeduction < 0) throw new PayrollException("Deductions must be ≥0");
        this.rssbContribution = 0.05 * basicPay;
        this.payeTax = payeTax;
        this.loanDeduction = loanDeduction;
    }
}
