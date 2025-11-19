package q3;

public final class TaxRecord {
    private String receiptNo;
    private double totalTax;

    public TaxRecord(String receiptNo, double totalTax) {
        this.receiptNo = receiptNo;
        this.totalTax = totalTax;
    }

    public double computeTax(double salary, double rate, double credits) {
        return (salary * rate) - credits;
    }

    public String getReceiptNo() { return receiptNo; }
    public double getTotalTax() { return totalTax; }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        try {
            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Enter Tax Rate (decimal, e.g., 0.15): ");
            double rate = sc.nextDouble();
            System.out.print("Enter Credits: ");
            double credits = sc.nextDouble();

            TaxRecord record = new TaxRecord("REC1001", 0);
            double tax = record.computeTax(salary, rate, credits);

            System.out.println("\n===== TAX RECORD =====");
            System.out.println("Receipt No 27120: " + record.getReceiptNo());
            System.out.println("Salary 27120: $" + salary );
            System.out.println("Tax Rate 27120: " + rate );
            System.out.println("Credits 27120: $" + credits );
            System.out.println("Total Tax 27120: $" + tax );

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
