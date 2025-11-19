package q1;
import java.util.Date;

public class Purchase extends Entity {
    private Date purchaseDate;
    private int purchasedQuantity;
    private String supplierName;
    
    public Purchase(int id, Date createdDate, Date updatedDate, 
                   Date purchaseDate, int purchasedQuantity, String supplierName) {
        super(id, createdDate, updatedDate);
        setPurchaseDate(purchaseDate);
        setPurchasedQuantity(purchasedQuantity);
        setSupplierName(supplierName);
    }
    
    // Getters and Setters with validation
    public Date getPurchaseDate() { return purchaseDate; }
    public int getPurchasedQuantity() { return purchasedQuantity; }
    public String getSupplierName() { return supplierName; }
    
    public void setPurchaseDate(Date purchaseDate) {
        if (purchaseDate == null) {
            throw new IllegalArgumentException("Purchase date cannot be null");
        }
        this.purchaseDate = purchaseDate;
    }
    
    public void setPurchasedQuantity(int purchasedQuantity) {
        if (purchasedQuantity <= 0) {
            throw new IllegalArgumentException("Purchased quantity must be greater than 0");
        }
        this.purchasedQuantity = purchasedQuantity;
    }
    
    public void setSupplierName(String supplierName) {
        if (supplierName == null || supplierName.trim().isEmpty()) {
            throw new IllegalArgumentException("Supplier name cannot be empty");
        }
        this.supplierName = supplierName;
    }
}
