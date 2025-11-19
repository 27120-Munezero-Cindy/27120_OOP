package q2;

import java.time.LocalDate;

public class Booking extends Passenger {
    protected LocalDate bookingDate;
    protected String seatNumber;
    protected String travelClass; // Economy/Business/First

    public Booking(int id, String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   LocalDate bookingDate, String seatNumber, String travelClass) throws FlightException {
        super(id, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears,
                crewName, role, shift, passengerName, age, gender, contact);
        if (!"Economy".equals(travelClass) && !"Business".equals(travelClass) && !"First".equals(travelClass))
            throw new FlightException("Class must be Economy/Business/First");
        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.travelClass = travelClass;
    }
}
