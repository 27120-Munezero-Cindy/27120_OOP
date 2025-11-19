package q1;
public class Inventory extends Entity {
    private int totalItems;
    private double stockValue;
    
    public Inventory(int id, java.util.Date createdDate, java.util.Date updatedDate, 
                    int totalItems, double stockValue) {
        super(id, createdDate, updatedDate);
        setTotalItems(totalItems);
        setStockValue(stockValue);
    }
    
    // Getters and Setters with validation
    public int getTotalItems() { return totalItems; }
    public double getStockValue() { return stockValue; }
    
    public void setTotalItems(int totalItems) {
        if (totalItems < 0) {
            throw new IllegalArgumentException("Total items cannot be negative");
        }
        this.totalItems = totalItems;
    }
    
    public void setStockValue(double stockValue) {
        if (stockValue < 0) {
            throw new IllegalArgumentException("Stock value cannot be negative");
        }
        this.stockValue = stockValue;
    }
}
