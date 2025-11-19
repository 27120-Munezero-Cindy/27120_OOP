package q4;

public class Product extends Supplier {
    protected String productName;
    protected double unitPrice;
    protected int quantity;

    public Product(int id, String orgName, String address, String contactEmail,
                   String deptName, String deptCode,
                   String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity)
            throws ProcurementException {
        super(id, orgName, address, contactEmail, deptName, deptCode,
                supplierName, supplierTIN, contact);

        if (unitPrice <= 0) throw new ProcurementException("Unit price must be > 0");
        if (quantity < 0) throw new ProcurementException("Quantity cannot be negative");

        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
}
