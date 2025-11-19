package q5;

import java.time.LocalDate;

public class LeaveRequest extends AttendanceRecord {
    protected LocalDate requestDate;
    protected String reason;
    protected boolean approved;

    public LeaveRequest(int id, String institutionName, String code, String address,
                        String departmentName, String departmentHead,
                        String courseName, String courseCode, int credits,
                        String instructorName, String email, String phone,
                        String studentName, String studentID, int age,
                        LocalDate sessionDate, String topic,
                        String status,
                        LocalDate requestDate, String reason, boolean approved)
            throws AttendanceException {
        super(id, institutionName, code, address, departmentName, departmentHead,
                courseName, courseCode, credits, instructorName, email, phone,
                studentName, studentID, age, sessionDate, topic, status);
        if (reason == null || reason.isEmpty()) throw new AttendanceException("Reason required");
        this.requestDate = requestDate;
        this.reason = reason;
        this.approved = approved;
    }
}
