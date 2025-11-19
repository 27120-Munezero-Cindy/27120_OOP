package q1;
import java.util.Date;

public class Sale extends Entity {
    private Date saleDate;
    private int soldQuantity;
    private String customerName;
    
    public Sale(int id, Date createdDate, Date updatedDate, 
               Date saleDate, int soldQuantity, String customerName) {
        super(id, createdDate, updatedDate);
        setSaleDate(saleDate);
        setSoldQuantity(soldQuantity);
        setCustomerName(customerName);
    }
    
    // Getters and Setters with validation
    public Date getSaleDate() { return saleDate; }
    public int getSoldQuantity() { return soldQuantity; }
    public String getCustomerName() { return customerName; }
    
    public void setSaleDate(Date saleDate) {
        if (saleDate == null) {
            throw new IllegalArgumentException("Sale date cannot be null");
        }
        this.saleDate = saleDate;
    }
    
    public void setSoldQuantity(int soldQuantity) {
        if (soldQuantity <= 0) {
            throw new IllegalArgumentException("Sold quantity must be greater than 0");
        }
        this.soldQuantity = soldQuantity;
    }
    
    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be empty");
        }
        this.customerName = customerName;
    }
}