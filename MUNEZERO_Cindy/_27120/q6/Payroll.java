package q6;

public class Payroll extends Allowance {
    protected double grossSalary;
    protected double totalDeductions;
    protected double netSalary;

    public Payroll(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, java.time.LocalDate startDate, java.time.LocalDate endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus) throws PayrollException {
        super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance,
                payeTax, loanDeduction, overtimeHours, overtimeRate, bonus);
        this.grossSalary = basicPay + computeAllowance();
        this.totalDeductions = rssbContribution + payeTax + loanDeduction;
        this.netSalary = grossSalary - totalDeductions;
    }
}
