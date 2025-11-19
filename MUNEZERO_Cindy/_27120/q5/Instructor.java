package q5;

public class Instructor extends Course {
    protected String instructorName;
    protected String email;
    protected String phone;

    public Instructor(int id, String institutionName, String code, String address,
                      String departmentName, String departmentHead,
                      String courseName, String courseCode, int credits,
                      String instructorName, String email, String phone) throws AttendanceException {
        super(id, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits);
        if (email == null || !email.contains("@")) throw new AttendanceException("Invalid email");
        if (phone == null || !phone.matches("\\d{10}")) throw new AttendanceException("Phone must be 10 digits");
        this.instructorName = instructorName;
        this.email = email;
        this.phone = phone;
    }
}
