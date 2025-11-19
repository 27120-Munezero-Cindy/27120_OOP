package q2;

public class Passenger extends CabinCrew {
    protected String passengerName;
    protected int age;
    protected String gender; // Male/Female/Other
    protected String contact;

    public Passenger(int id, String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift,
                     String passengerName, int age, String gender, String contact) throws FlightException {
        super(id, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears,
                crewName, role, shift);
        if (age <= 0) throw new FlightException("Age must be > 0");
        if (gender == null || gender.isEmpty()) throw new FlightException("Invalid gender");
        this.passengerName = passengerName;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }
}
