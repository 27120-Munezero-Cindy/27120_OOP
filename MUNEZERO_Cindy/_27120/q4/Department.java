package q4;

public class Department extends Organization {
    protected String deptName;
    protected String deptCode;

    public Department(int id, String orgName, String address, String contactEmail,
                      String deptName, String deptCode) throws ProcurementException {
        super(id, orgName, address, contactEmail);

        if (deptCode == null || deptCode.length() < 3 || !deptCode.matches("[A-Za-z0-9]+")) {
            throw new ProcurementException("Dept code must be alphanumeric and >= 3 chars");
        }

        this.deptName = deptName;
        this.deptCode = deptCode;
    }
}
