package q2;

import java.time.LocalDate;

public class Entity {
    protected int id;
    protected LocalDate createdDate;
    protected LocalDate updatedDate;

    public Entity(int id) throws FlightException {
        if (id <= 0) throw new FlightException("ID must be > 0");
        this.id = id;
        this.createdDate = LocalDate.now();
        this.updatedDate = LocalDate.now();
    }
}
