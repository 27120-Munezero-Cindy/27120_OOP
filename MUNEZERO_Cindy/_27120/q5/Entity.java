package q5;

import java.time.LocalDate;

public class Entity {
    protected int id;
    protected LocalDate createdDate;
    protected LocalDate updatedDate;

    public Entity(int id) throws AttendanceException {
        if (id <= 0) {
            throw new AttendanceException("ID must be greater than 0");
        }
        this.id = id;
        this.createdDate = LocalDate.now();
        this.updatedDate = LocalDate.now();
    }
}
