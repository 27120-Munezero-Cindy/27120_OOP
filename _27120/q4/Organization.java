package q4;

public class Organization extends Entity {
    protected String orgName;
    protected String address;
    protected String contactEmail;

    public Organization(int id, String orgName, String address, String contactEmail)
            throws ProcurementException {
        super(id);
        if (contactEmail == null || !contactEmail.contains("@")) {
            throw new ProcurementException("Invalid email");
        }
        this.orgName = orgName;
        this.address = address;
        this.contactEmail = contactEmail;
    }
}
