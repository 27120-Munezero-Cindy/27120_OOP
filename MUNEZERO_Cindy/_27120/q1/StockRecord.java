package q1;

public class StockRecord extends StockAudit {
    protected String status;

    public StockRecord(int id, String name, String category, String supplierName,
                       String warehouseName, int quantity, int movedQty, boolean checked,
                       String status) {
        super(id, name, category, supplierName, warehouseName, quantity, movedQty, checked);
        this.status = status;
    }
}

