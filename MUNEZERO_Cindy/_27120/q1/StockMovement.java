package q1;

public class StockMovement extends StockLevel {
    protected int movedQty;

    public StockMovement(int id, String name, String category, String supplierName,
                         String warehouseName, int quantity, int movedQty) {
        super(id, name, category, supplierName, warehouseName, quantity);
        this.movedQty = movedQty;
    }
}
