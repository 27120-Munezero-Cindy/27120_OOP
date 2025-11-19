package q4;

public class Inspection extends Delivery {
    protected String inspectorName;
    protected String status; // Passed or Failed
    protected String remarks;

    public Inspection(int id, String orgName, String address, String contactEmail,
                      String deptName, String deptCode,
                      String supplierName, String supplierTIN, String contact,
                      String productName, double unitPrice, int quantity,
                      String poNumber, double totalAmount,
                      String deliveredBy,
                      String inspectorName, String status, String remarks)
            throws ProcurementException {
        super(id, orgName, address, contactEmail, deptName, deptCode,
                supplierName, supplierTIN, contact, productName, unitPrice, quantity,
                poNumber, totalAmount, deliveredBy);

        if (!"Passed".equals(status) && !"Failed".equals(status)) {
            throw new ProcurementException("Status must be 'Passed' or 'Failed'");
        }

        this.inspectorName = inspectorName;
        this.status = status;
        this.remarks = remarks;
    }
}
