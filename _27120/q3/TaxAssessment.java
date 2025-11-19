package q3;

public class TaxAssessment extends Entity {
    private String assessmentDate;
    private double assessedTax;

    public TaxAssessment(int id, String createdDate, String updatedDate,
                         String assessmentDate, double assessedTax) throws TaxDataException {
        super(id, createdDate, updatedDate);
        if(assessedTax < 0) throw new TaxDataException("Assessed tax must be ≥ 0");
        this.assessmentDate = assessmentDate;
        this.assessedTax = assessedTax;
    }

    public String getAssessmentDate() { return assessmentDate; }
    public double getAssessedTax() { return assessedTax; }
}
