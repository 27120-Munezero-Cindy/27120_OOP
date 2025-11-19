package q1;

public class Product extends Entity {
    private String productName;
    private double unitPrice;
    private int stockLimit;
    
    public Product(int id, java.util.Date createdDate, java.util.Date updatedDate, 
                  String productName, double unitPrice, int stockLimit) {
        super(id, createdDate, updatedDate);
        setProductName(productName);
        setUnitPrice(unitPrice);
        setStockLimit(stockLimit);
    }
    
    // Getters and Setters with validation
    public String getProductName() { return productName; }
    public double getUnitPrice() { return unitPrice; }
    public int getStockLimit() { return stockLimit; }
    
    public void setProductName(String productName) {
        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        this.productName = productName;
    }
    
    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0) {
            throw new IllegalArgumentException("Unit price must be greater than 0");
        }
        this.unitPrice = unitPrice;
    }
    
    public void setStockLimit(int stockLimit) {
        if (stockLimit < 0) {
            throw new IllegalArgumentException("Stock limit cannot be negative");
        }
        this.stockLimit = stockLimit;
    }
}
