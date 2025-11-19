package q1;

public class StockLevel extends Warehouse {
    protected int quantity;

    public StockLevel(int id, String name, String category, String supplierName,
                      String warehouseName, int quantity) {
        super(id, name, category, supplierName, warehouseName);
        this.quantity = quantity;
    }
}
