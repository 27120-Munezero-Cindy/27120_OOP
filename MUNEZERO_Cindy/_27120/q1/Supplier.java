package q1;

public class Supplier extends Entity {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;
    
    public Supplier(int id, java.util.Date createdDate, java.util.Date updatedDate, 
                   String supplierName, String supplierEmail, String supplierPhone) {
        super(id, createdDate, updatedDate);
        setSupplierName(supplierName);
        setSupplierEmail(supplierEmail);
        setSupplierPhone(supplierPhone);
    }
    
    // Getters and Setters with validation
    public String getSupplierName() { return supplierName; }
    public String getSupplierEmail() { return supplierEmail; }
    public String getSupplierPhone() { return supplierPhone; }
    
    public void setSupplierName(String supplierName) {
        if (supplierName == null || supplierName.trim().isEmpty()) {
            throw new IllegalArgumentException("Supplier name cannot be empty");
        }
        this.supplierName = supplierName;
    }
    
    public void setSupplierEmail(String supplierEmail) {
        if (supplierEmail == null || !supplierEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.supplierEmail = supplierEmail;
    }
    
    public void setSupplierPhone(String supplierPhone) {
        if (supplierPhone == null || !supplierPhone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Supplier phone must be exactly 10 digits");
        }
        this.supplierPhone = supplierPhone;
    }
}
