package q2;

public class Airport extends Entity {
    protected String airportName;
    protected String code;
    protected String location;

    public Airport(int id, String airportName, String code, String location) throws FlightException {
        super(id);
        if (code == null || !code.matches("[A-Z]{3}")) throw new FlightException("Airport code must be 3 uppercase letters");
        this.airportName = airportName;
        this.code = code;
        this.location = location;
    }
}
