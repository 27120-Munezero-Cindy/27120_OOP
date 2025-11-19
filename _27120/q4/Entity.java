package q4;

import java.time.LocalDate;

public class Entity {
    protected int id;
    protected LocalDate createdDate;
    protected LocalDate updatedDate;

    public Entity(int id) throws ProcurementException {
        if (id <= 0) {
            throw new ProcurementException("ID must be greater than 0");
        }
        this.id = id;
        this.createdDate = LocalDate.now();
        this.updatedDate = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }
}


