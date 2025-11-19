package q1;

public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String contactNumber;
    
    public Warehouse(int id, java.util.Date createdDate, java.util.Date updatedDate, 
                    String warehouseName, String location, String contactNumber) {
        super(id, createdDate, updatedDate);
        setWarehouseName(warehouseName);
        setLocation(location);
        setContactNumber(contactNumber);
    }

    // Compatibility constructor used by some classes that pass fewer parameters
    public Warehouse(int id, String name, String category, String supplierName, String warehouseName) {
        super(id, new java.util.Date(), new java.util.Date());
        setWarehouseName(warehouseName);
        // sensible defaults
        setLocation("Unknown");
        setContactNumber("0000000000");
    }
    
    
    public String getWarehouseName() { return warehouseName; }
    public String getLocation() { return location; }
    public String getContactNumber() { return contactNumber; }
    
    public void setWarehouseName(String warehouseName) {
        if (warehouseName == null || warehouseName.trim().isEmpty()) {
            throw new IllegalArgumentException("Warehouse name cannot be empty");
        }
        this.warehouseName = warehouseName;
    }
    
    public void setLocation(String location) {
        if (location == null || location.trim().isEmpty()) {
            throw new IllegalArgumentException("Location cannot be empty");
        }
        this.location = location;
    }
    
    public void setContactNumber(String contactNumber) {
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new IllegalArgumentException("Contact number must be exactly 10 digits");
        }
        this.contactNumber = contactNumber;
    }
}