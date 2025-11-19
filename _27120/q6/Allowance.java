package q6;

public class Allowance extends Deduction {
    protected double overtimeHours;
    protected double overtimeRate;
    protected double bonus;

    public Allowance(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                     String deptName, String deptCode, String managerName,
                     int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                     int month, int year, java.time.LocalDate startDate, java.time.LocalDate endDate,
                     double basicPay, double transportAllowance, double housingAllowance,
                     double payeTax, double loanDeduction,
                     double overtimeHours, double overtimeRate, double bonus) throws PayrollException {
        super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance,
                payeTax, loanDeduction);
        if (overtimeHours < 0 || overtimeRate < 0 || bonus < 0) throw new PayrollException("Allowance values must be ≥0");
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
        this.bonus = bonus;
    }

    public double computeAllowance() {
        return (overtimeHours * overtimeRate) + bonus + transportAllowance + housingAllowance;
    }
}
