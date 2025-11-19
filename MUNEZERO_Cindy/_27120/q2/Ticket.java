package q2;

import java.time.LocalDate;
import java.util.Scanner;

public final class Ticket extends Payment {
    protected String ticketNumber;
    protected LocalDate issueDate;

    public Ticket(int id, String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare,
                  String pilotName, String licenseNumber, int experienceYears,
                  String crewName, String role, String shift,
                  String passengerName, int age, String gender, String contact,
                  LocalDate bookingDate, String seatNumber, String travelClass,
                  LocalDate paymentDate, String paymentMethod, double amountPaid,
                  String ticketNumber, LocalDate issueDate) throws FlightException {
        super(id, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears,
                crewName, role, shift, passengerName, age, gender, contact,
                bookingDate, seatNumber, travelClass, paymentDate, paymentMethod, amountPaid);
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
    }

    public double calculateFare() {
        double taxes = 0.15 * baseFare; // 15% tax
        double discount = 0;
        if ("Business".equals(travelClass)) discount = 0.05 * baseFare;
        else if ("First".equals(travelClass)) discount = 0.1 * baseFare;
        return baseFare + taxes - discount;
    }

    public void printTicket() {
    System.out.println("27120"); // student ID
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Flight: " + flightNumber + " (" + departure + " → " + destination + ")");
        System.out.println("Class: " + travelClass);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Fare: " + calculateFare());
        System.out.println("Issue Date: " + issueDate);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Passenger Name: ");
            String pname = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt(); sc.nextLine();
            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();
            System.out.print("Enter Contact: ");
            String contact = sc.nextLine();
            System.out.print("Enter Seat Number: ");
            String seat = sc.nextLine();
            System.out.print("Enter Class (Economy/Business/First): ");
            String travelClass = sc.nextLine();

            Ticket ticket = new Ticket(
                    1, "Kigali Int Airport", "KGL", "Kigali",
                    "RwandaAir", "RA", "contact@rwandaair.rw",
                    "RA101", "KGL", "NBO", 200,
                    "Cindy Munezero", "LIC123", 5,
                    "Jane Crew", "Attendant", "Day",
                    pname, age, gender, contact,
                    LocalDate.now(), seat, travelClass,
                    LocalDate.now(), "Card", 230,
                    "TKT-27120-001", LocalDate.now()
            );

            ticket.printTicket();

        } catch (FlightException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
