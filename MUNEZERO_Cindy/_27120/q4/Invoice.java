package q4;

public class Invoice extends Inspection {
    protected String invoiceNo;
    protected double invoiceAmount;

    public Invoice(int id, String orgName, String address, String contactEmail,
                   String deptName, String deptCode,
                   String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity,
                   String poNumber, double totalAmount,
                   String deliveredBy,
                   String inspectorName, String status, String remarks,
                   String invoiceNo, double invoiceAmount)
            throws ProcurementException {
        super(id, orgName, address, contactEmail, deptName, deptCode,
                supplierName, supplierTIN, contact, productName, unitPrice, quantity,
                poNumber, totalAmount, deliveredBy, inspectorName, status, remarks);

        if (invoiceNo == null || invoiceNo.trim().isEmpty()) {
            throw new ProcurementException("Invoice number required");
        }
        if (invoiceAmount <= 0) throw new ProcurementException("Invoice amount must be > 0");

        this.invoiceNo = invoiceNo;
        this.invoiceAmount = invoiceAmount;
    }
}
