package q6;

import java.time.LocalDate;

public class Entity {
    protected int id;
    protected LocalDate createdDate;
    protected LocalDate updatedDate;

    public Entity(int id) throws PayrollException {
        if (id <= 0) throw new PayrollException("ID must be > 0");
        this.id = id;
        this.createdDate = LocalDate.now();
        this.updatedDate = LocalDate.now();
    }
}
