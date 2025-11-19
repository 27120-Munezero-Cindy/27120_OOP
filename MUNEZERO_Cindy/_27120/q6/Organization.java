package q6;

public class Organization extends Entity {
    protected String orgName;
    protected String orgCode;
    protected String rssbNumber;
    protected String contactEmail;

    public Organization(int id, String orgName, String orgCode, String rssbNumber, String contactEmail) throws PayrollException {
        super(id);
        if (rssbNumber == null || !rssbNumber.matches("\\d{8}")) throw new PayrollException("RSSB number must be 8 digits");
        if (contactEmail == null || !contactEmail.contains("@")) throw new PayrollException("Invalid email");
        this.orgName = orgName;
        this.orgCode = orgCode;
        this.rssbNumber = rssbNumber;
        this.contactEmail = contactEmail;
    }
}
