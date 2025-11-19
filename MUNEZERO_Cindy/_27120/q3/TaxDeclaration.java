package q3;

public class TaxDeclaration extends Entity {
    private String declarationMonth;
    private double totalIncome;

    public TaxDeclaration(int id, String createdDate, String updatedDate,
                          String declarationMonth, double totalIncome) throws TaxDataException {
        super(id, createdDate, updatedDate);
        if(totalIncome < 0) throw new TaxDataException("Total income must be ≥ 0");
        this.declarationMonth = declarationMonth;
        this.totalIncome = totalIncome;
    }

    public String getDeclarationMonth() { return declarationMonth; }
    public double getTotalIncome() { return totalIncome; }
}
