package q2;

import java.time.LocalDate;

public class Payment extends Booking {
    protected LocalDate paymentDate;
    protected String paymentMethod;
    protected double amountPaid;

    public Payment(int id, String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   LocalDate bookingDate, String seatNumber, String travelClass,
                   LocalDate paymentDate, String paymentMethod, double amountPaid) throws FlightException {
        super(id, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears,
                crewName, role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass);
        if (amountPaid <= 0) throw new FlightException("Amount must be >0");
        if (paymentMethod == null || paymentMethod.isEmpty()) throw new FlightException("Payment method required");
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;
    }
}
