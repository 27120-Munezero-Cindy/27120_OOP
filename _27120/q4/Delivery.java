package q4;

public class Delivery extends PurchaseOrder {
    protected String deliveredBy;

    public Delivery(int id, String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTIN, String contact,
                    String productName, double unitPrice, int quantity,
                    String poNumber, double totalAmount,
                    String deliveredBy) throws ProcurementException {
        super(id, orgName, address, contactEmail, deptName, deptCode,
                supplierName, supplierTIN, contact, productName, unitPrice, quantity,
                poNumber, totalAmount);

        if (deliveredBy == null || deliveredBy.trim().isEmpty())
            throw new ProcurementException("DeliveredBy cannot be null or empty");

        this.deliveredBy = deliveredBy;
    }
}
