package q6;

import java.time.LocalDate;

public class PayrollPeriod extends Employee {
    protected int month; // 1-12
    protected int year; // ≥2000
    protected LocalDate startDate;
    protected LocalDate endDate;

    public PayrollPeriod(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                         String deptName, String deptCode, String managerName,
                         int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                         int month, int year, LocalDate startDate, LocalDate endDate) throws PayrollException {
        super(id, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered);
        if (month < 1 || month > 12) throw new PayrollException("Month must be 1–12");
        if (year < 2000) throw new PayrollException("Year must be ≥2000");
        if (startDate == null || endDate == null) throw new PayrollException("Dates cannot be null");
        this.month = month;
        this.year = year;
        this.startDate = startDate;
        this.endDate = endDate;
    }

}
