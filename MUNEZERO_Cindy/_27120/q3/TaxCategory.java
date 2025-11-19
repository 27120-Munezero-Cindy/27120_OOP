package q3;

public class TaxCategory extends Entity {
    private String categoryName;
    private double rate;
    private String code;

    public TaxCategory(int id, String createdDate, String updatedDate,
                       String categoryName, double rate, String code) throws TaxDataException {
        super(id, createdDate, updatedDate);
        if(rate <= 0) throw new TaxDataException("Rate must be > 0");
        if(code.length() < 3) throw new TaxDataException("Code must have at least 3 chars");
        this.categoryName = categoryName;
        this.rate = rate;
        this.code = code;
    }

    public String getCategoryName() { return categoryName; }
    public double getRate() { return rate; }
    public String getCode() { return code; }
}
