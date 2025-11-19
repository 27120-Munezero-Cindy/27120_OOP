package q5;

public class Department extends Institution {
    protected String departmentName;
    protected String departmentHead;

    public Department(int id, String institutionName, String code, String address,
                      String departmentName, String departmentHead) throws AttendanceException {
        super(id, institutionName, code, address);
        if (departmentHead == null || departmentHead.isEmpty()) throw new AttendanceException("Department head required");
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }
}

