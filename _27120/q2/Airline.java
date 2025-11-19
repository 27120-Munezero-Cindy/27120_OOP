package q2;

public class Airline extends Airport {
    protected String airlineName;
    protected String airlineCode;
    protected String contactEmail;

    public Airline(int id, String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail) throws FlightException {
        super(id, airportName, code, location);
        if (airlineCode == null || !airlineCode.matches("[A-Za-z]{2,4}")) throw new FlightException("Airline code must be 2–4 letters");
        if (contactEmail == null || !contactEmail.contains("@")) throw new FlightException("Invalid email");
        this.airlineName = airlineName;
        this.airlineCode = airlineCode;
        this.contactEmail = contactEmail;
    }
}
