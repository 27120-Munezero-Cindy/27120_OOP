package q2;

public class CabinCrew extends Pilot {
    protected String crewName;
    protected String role;
    protected String shift; // Day/Night

    public CabinCrew(int id, String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift) throws FlightException {
        super(id, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears);
        if (role == null || role.isEmpty()) throw new FlightException("Role required");
        if (!"Day".equals(shift) && !"Night".equals(shift)) throw new FlightException("Shift must be Day/Night");
        this.crewName = crewName;
        this.role = role;
        this.shift = shift;
    }
}

