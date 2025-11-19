package q5;

public class AttendanceRecord extends ClassSession {
    protected String status; // Present / Absent

    public AttendanceRecord(int id, String institutionName, String code, String address,
                            String departmentName, String departmentHead,
                            String courseName, String courseCode, int credits,
                            String instructorName, String email, String phone,
                            String studentName, String studentID, int age,
                            java.time.LocalDate sessionDate, String topic,
                            String status) throws AttendanceException {
        super(id, institutionName, code, address, departmentName, departmentHead,
                courseName, courseCode, credits, instructorName, email, phone,
                studentName, studentID, age, sessionDate, topic);
        if (!"Present".equals(status) && !"Absent".equals(status)) throw new AttendanceException("Status must be Present/Absent");
        this.status = status;
    }
}
