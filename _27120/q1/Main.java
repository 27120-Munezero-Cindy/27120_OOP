package q1;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Create a sample stock report
            System.out.println("Enter report remarks:");
            String remarks = scanner.nextLine();
            
            StockReport report = new StockReport(1, new Date(), new Date(), new Date(), remarks);
            
            // Generate and display the report
            report.generateReport();
            
            // Demonstrate other classes with user input
            System.out.println("\nEnter product details:");
            System.out.print("Product Name: ");
            String productName = scanner.nextLine();
            System.out.print("Unit Price: ");
            double unitPrice = scanner.nextDouble();
            System.out.print("Stock Limit: ");
            int stockLimit = scanner.nextInt();
            
            Product product = new Product(1, new Date(), new Date(), productName, unitPrice, stockLimit);
            System.out.println("27120_Product created successfully: " + product.getProductName());
            
        } catch (Exception e) {
            System.out.println("27120_Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
