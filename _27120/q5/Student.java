package q5;

public class Student extends Instructor {
    protected String studentName;
    protected String studentID;
    protected int age;

    public Student(int id, String institutionName, String code, String address,
                   String departmentName, String departmentHead,
                   String courseName, String courseCode, int credits,
                   String instructorName, String email, String phone,
                   String studentName, String studentID, int age) throws AttendanceException {
        super(id, institutionName, code, address, departmentName, departmentHead,
                courseName, courseCode, credits, instructorName, email, phone);
        if (age <= 0) throw new AttendanceException("Age must be > 0");
        this.studentName = studentName;
        this.studentID = studentID;
        this.age = age;
    }
}
