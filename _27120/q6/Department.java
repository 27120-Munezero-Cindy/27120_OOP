package q6;

public class Department extends Organization {
    protected String deptName;
    protected String deptCode;
    protected String managerName;

    public Department(int id, String orgName, String orgCode, String rssbNumber, String contactEmail,
                      String deptName, String deptCode, String managerName) throws PayrollException {
        super(id, orgName, orgCode, rssbNumber, contactEmail);
        if (deptCode == null || deptCode.length() < 3) throw new PayrollException("Dept code must be ≥3 chars");
        if (managerName == null || managerName.isEmpty()) throw new PayrollException("Manager name required");
        this.deptName = deptName;
        this.deptCode = deptCode;
        this.managerName = managerName;
    }
}
