package q1;

public class Category extends Entity {
    private String categoryName;
    private String categoryCode;
    
    public Category(int id, java.util.Date createdDate, java.util.Date updatedDate, 
                   String categoryName, String categoryCode) {
        super(id, createdDate, updatedDate);
        setCategoryName(categoryName);
        setCategoryCode(categoryCode);
    }
    
    // Getters and Setters with validation
    public String getCategoryName() { return categoryName; }
    public String getCategoryCode() { return categoryCode; }
    
    public void setCategoryName(String categoryName) {
        if (categoryName == null || categoryName.trim().isEmpty()) {
            throw new IllegalArgumentException("Category name cannot be empty");
        }
        this.categoryName = categoryName;
    }
    
    public void setCategoryCode(String categoryCode) {
        if (categoryCode == null || categoryCode.length() < 3 || !categoryCode.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("Category code must be at least 3 alphanumeric characters");
        }
        this.categoryCode = categoryCode;
    }
}
