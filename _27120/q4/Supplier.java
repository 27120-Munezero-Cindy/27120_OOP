package q4;

public class Supplier extends Department {
    protected String supplierName;
    protected String supplierTIN;
    protected String contact;

    public Supplier(int id, String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTIN, String contact)
            throws ProcurementException {
        super(id, orgName, address, contactEmail, deptName, deptCode);

        if (supplierTIN == null || !supplierTIN.matches("\\d{9}")) {
            throw new ProcurementException("Supplier TIN must be 9 digits");
        }
        if (contact == null || !contact.matches("\\d{10}")) {
            throw new ProcurementException("Contact must be 10 digits");
        }

        this.supplierName = supplierName;
        this.supplierTIN = supplierTIN;
        this.contact = contact;
    }
}
