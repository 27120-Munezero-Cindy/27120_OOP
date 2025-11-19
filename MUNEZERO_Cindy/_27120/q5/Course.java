package q5;

public class Course extends Department {
    protected String courseName;
    protected String courseCode;
    protected int credits;

    public Course(int id, String institutionName, String code, String address,
                  String departmentName, String departmentHead,
                  String courseName, String courseCode, int credits) throws AttendanceException {
        super(id, institutionName, code, address, departmentName, departmentHead);
        if (credits <= 0) throw new AttendanceException("Credits must be > 0");
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }
}
