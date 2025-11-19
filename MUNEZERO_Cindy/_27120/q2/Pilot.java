package q2;

public class Pilot extends Flight {
    protected String pilotName;
    protected String licenseNumber;
    protected int experienceYears;

    public Pilot(int id, String airportName, String code, String location,
                 String airlineName, String airlineCode, String contactEmail,
                 String flightNumber, String departure, String destination, double baseFare,
                 String pilotName, String licenseNumber, int experienceYears) throws FlightException {
        super(id, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare);
        if (licenseNumber == null || licenseNumber.isEmpty()) throw new FlightException("License cannot be empty");
        if (experienceYears < 2) throw new FlightException("Experience must be ≥ 2 years");
        this.pilotName = pilotName;
        this.licenseNumber = licenseNumber;
        this.experienceYears = experienceYears;
    }
}

