package q1;

public class StockAudit extends StockMovement {
    protected boolean checked;

    public StockAudit(int id, String name, String category, String supplierName,
                      String warehouseName, int quantity, int movedQty, boolean checked) {
        super(id, name, category, supplierName, warehouseName, quantity, movedQty);
        this.checked = checked;
    }
}
