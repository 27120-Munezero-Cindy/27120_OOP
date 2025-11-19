package q6;

import java.time.LocalDate;
import java.util.Scanner;

public final class Payslip extends Payroll {
    protected String payslipNumber;
    protected LocalDate issueDate;

    public Payslip(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, LocalDate startDate, LocalDate endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus,
                   String payslipNumber, LocalDate issueDate) throws PayrollException {
        super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance,
                payeTax, loanDeduction, overtimeHours, overtimeRate, bonus);
        this.payslipNumber = payslipNumber;
        this.issueDate = issueDate;
    }

    public void generatePayslip() {
        System.out.println("27120"); // Student ID
        System.out.println("Payslip Number: " + payslipNumber);
        System.out.println("Employee: " + fullName + " (" + employeeID + ")");
        System.out.println("Position: " + position);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Allowances: " + computeAllowance());
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Deductions: " + totalDeductions + " (RSSB: " + rssbContribution + ", PAYE: " + payeTax + ", Loan: " + loanDeduction + ")");
        System.out.println("Net Salary: " + netSalary);
        System.out.println("Issue Date: " + issueDate);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Employee Full Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Employee ID (≥1000): ");
            int empID = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Position: ");
            String position = sc.nextLine();
            System.out.print("Enter Base Salary: ");
            double baseSalary = sc.nextDouble();
            System.out.print("Is RSSB Registered? (true/false): ");
            boolean rssbReg = sc.nextBoolean();
            System.out.print("Enter PAYE Tax: ");
            double payeTax = sc.nextDouble();
            System.out.print("Enter Loan Deduction: ");
            double loanDeduction = sc.nextDouble();
            System.out.print("Enter Overtime Hours: ");
            double overtimeHours = sc.nextDouble();
            System.out.print("Enter Overtime Rate: ");
            double overtimeRate = sc.nextDouble();
            System.out.print("Enter Bonus: ");
            double bonus = sc.nextDouble();

            Payslip slip = new Payslip(
                    1, "MUNEZERO Company", "Cin10", "12345678", "info@cindy.rw",
                    "IT", "ITD", "Manager A",
                    empID, name, position, baseSalary, rssbReg,
                    11, 2025, java.time.LocalDate.of(2025, 11, 1), java.time.LocalDate.of(2025, 11, 30),
                    baseSalary, 200, 300,
                    payeTax, loanDeduction,
                    overtimeHours, overtimeRate, bonus,
                        "PS-27120-001", java.time.LocalDate.now()
            );

            slip.generatePayslip();

        } catch (PayrollException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
