package q4;

public class PurchaseOrder extends Product {
    protected String poNumber;
    protected double totalAmount;

    public PurchaseOrder(int id, String orgName, String address, String contactEmail,
                         String deptName, String deptCode,
                         String supplierName, String supplierTIN, String contact,
                         String productName, double unitPrice, int quantity,
                         String poNumber, double totalAmount)
            throws ProcurementException {
        super(id, orgName, address, contactEmail, deptName, deptCode,
                supplierName, supplierTIN, contact, productName, unitPrice, quantity);

        if (poNumber == null || poNumber.trim().isEmpty()) {
            throw new ProcurementException("PO number required");
        }
        if (totalAmount <= 0) throw new ProcurementException("Total amount must be > 0");

        this.poNumber = poNumber;
        this.totalAmount = totalAmount;
    }
}
