package q5;

public class Institution extends Entity {
    protected String institutionName;
    protected String code;
    protected String address;

    public Institution(int id, String institutionName, String code, String address) throws AttendanceException {
        super(id);
        if (code == null || code.length() < 3) throw new AttendanceException("Institution code must be >= 3 chars");
        this.institutionName = institutionName;
        this.code = code;
        this.address = address;
    }
}
