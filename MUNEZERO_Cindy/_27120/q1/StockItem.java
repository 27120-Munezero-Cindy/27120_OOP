package q1;
public class StockItem extends Entity {
    private int quantityAvailable;
    private int reorderLevel;
    
    public StockItem(int id, java.util.Date createdDate, java.util.Date updatedDate, 
                    int quantityAvailable, int reorderLevel) {
        super(id, createdDate, updatedDate);
        setQuantityAvailable(quantityAvailable);
        setReorderLevel(reorderLevel);
    }
    
    // Getters and Setters with validation
    public int getQuantityAvailable() { return quantityAvailable; }
    public int getReorderLevel() { return reorderLevel; }
    
    public void setQuantityAvailable(int quantityAvailable) {
        if (quantityAvailable < 0) {
            throw new IllegalArgumentException("Quantity available cannot be negative");
        }
        this.quantityAvailable = quantityAvailable;
    }
    
    public void setReorderLevel(int reorderLevel) {
        if (reorderLevel < 0) {
            throw new IllegalArgumentException("Reorder level cannot be negative");
        }
        this.reorderLevel = reorderLevel;
    }
}