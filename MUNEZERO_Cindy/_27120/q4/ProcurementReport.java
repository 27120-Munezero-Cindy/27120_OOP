package q4;

import java.util.Scanner;

public final class ProcurementReport extends Invoice {
    protected String summary;

    public ProcurementReport(int id, String orgName, String address, String contactEmail,
                             String deptName, String deptCode,
                             String supplierName, String supplierTIN, String contact,
                             String productName, double unitPrice, int quantity,
                             String poNumber, double totalAmount,
                             String deliveredBy,
                             String inspectorName, String status, String remarks,
                             String invoiceNo, double invoiceAmount,
                             String summary) throws ProcurementException {
        super(id, orgName, address, contactEmail, deptName, deptCode,
                supplierName, supplierTIN, contact,
                productName, unitPrice, quantity,
                poNumber, totalAmount, deliveredBy,
                inspectorName, status, remarks,
                invoiceNo, invoiceAmount);
        this.summary = summary;
    }

    public double calculateTotal() {
        return this.invoiceAmount;
    }

    // main method for user input and demonstration
    public static void main(String[] args) {
        System.out.println("27120"); // student ID

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Supplier Name: ");
            String supplierName = sc.nextLine();

            System.out.print("Enter Supplier TIN (9 digits): ");
            String supplierTIN = sc.next();

            System.out.print("Enter Supplier Contact (10 digits): ");
            String supplierContact = sc.next();

            sc.nextLine(); // consume newline

            System.out.print("Enter Product Name: ");
            String productName = sc.nextLine();

            System.out.print("Enter Unit Price: ");
            double unitPrice = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            double totalAmount = unitPrice * quantity;

            ProcurementReport report = new ProcurementReport(
                    1,
                    "MUNEZERO Company", "Kigali", "info@cindy.rw",
                    "Procurement", "PCD",
                    supplierName, supplierTIN, supplierContact,
                    productName, unitPrice, quantity,
                    "PO-27120-001", totalAmount,
                    "DeliveryGuy",
                    "Inspector KAZE", "Passed", "Good",
                    "INV-27120-001", totalAmount,
                    "Procurement Completed"
            );

            System.out.println("Total Purchase Amount = " + report.calculateTotal());

        } catch (ProcurementException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
