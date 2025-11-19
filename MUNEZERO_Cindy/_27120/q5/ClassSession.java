package q5;

import java.time.LocalDate;

public class ClassSession extends Student {
    protected LocalDate sessionDate;
    protected String topic;

    public ClassSession(int id, String institutionName, String code, String address,
                        String departmentName, String departmentHead,
                        String courseName, String courseCode, int credits,
                        String instructorName, String email, String phone,
                        String studentName, String studentID, int age,
                        LocalDate sessionDate, String topic) throws AttendanceException {
        super(id, institutionName, code, address, departmentName, departmentHead,
                courseName, courseCode, credits, instructorName, email, phone,
                studentName, studentID, age);
        if (sessionDate == null) throw new AttendanceException("Session date required");
        if (topic == null || topic.isEmpty()) throw new AttendanceException("Topic required");
        this.sessionDate = sessionDate;
        this.topic = topic;
    }
}
