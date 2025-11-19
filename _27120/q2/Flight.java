package q2;

public class Flight extends Airline {
    protected String flightNumber;
    protected String departure;
    protected String destination;
    protected double baseFare;

    public Flight(int id, String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare) throws FlightException {
        super(id, airportName, code, location, airlineName, airlineCode, contactEmail);
        if (flightNumber == null || flightNumber.isEmpty() || departure == null || departure.isEmpty() || destination == null || destination.isEmpty())
            throw new FlightException("Flight fields cannot be empty");
        if (baseFare <= 0) throw new FlightException("Base fare must be > 0");
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.baseFare = baseFare;
    }
}
