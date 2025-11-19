package q5;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public final class AttendanceSummary extends LeaveRequest {
    protected LocalDate reportDate;
    protected int totalPresent;
    protected int totalAbsent;

    public AttendanceSummary(int id, String institutionName, String code, String address,
                             String departmentName, String departmentHead,
                             String courseName, String courseCode, int credits,
                             String instructorName, String email, String phone,
                             String studentName, String studentID, int age,
                             LocalDate sessionDate, String topic,
                             String status,
                             LocalDate requestDate, String reason, boolean approved,
                             LocalDate reportDate) throws AttendanceException {
        super(id, institutionName, code, address, departmentName, departmentHead,
                courseName, courseCode, credits, instructorName, email, phone,
                studentName, studentID, age, sessionDate, topic, status,
                requestDate, reason, approved);
        this.reportDate = reportDate;
        this.totalPresent = 0;
        this.totalAbsent = 0;
    }

    public void generateSummary(List<AttendanceRecord> records) {
        for (AttendanceRecord record : records) {
            if ("Present".equals(record.status)) totalPresent++;
            else if ("Absent".equals(record.status)) totalAbsent++;
        }
        int totalSessions = totalPresent + totalAbsent;
        double percentage = totalSessions > 0 ? ((double) totalPresent / totalSessions) * 100 : 0;
        System.out.println("27120"); // student ID
        System.out.println("Total Present: " + totalPresent);
        System.out.println("Total Absent: " + totalAbsent);
        System.out.println("Attendance Percentage: " + String.format("%.2f", percentage) + "%");
    }

    public static void main(String[] args) throws AttendanceException {
        Scanner sc = new Scanner(System.in);
        List<AttendanceRecord> records = new ArrayList<>();

        System.out.print("Enter number of sessions: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String studentName = sc.nextLine();
            System.out.print("Enter status (Present/Absent): ");
            String status = sc.nextLine();

            AttendanceRecord record = new AttendanceRecord(
                    1, "MUNEZERO Company", "MNZ", "Kigali",
                    "CS", "Dr MUVUNYI", "OOP", "OOP121", 3,
                    "Dr GATARE", "inst@MNZ.rw", "0792981047",
                    studentName, "S021", 21,
                    LocalDate.now(), "Topic " + (i + 1),
                    status
            );
            records.add(record);
        }

        AttendanceSummary summary = new AttendanceSummary(
                1, "MUNEZERO Company", "MNZ", "Kigali",
                "CS", "Dr MUVUNYI", "OOP", "OOP121", 3,
                "Dr GATARE", "inst@MNZ.rw", "0792981047",
                "Student A", "S021", 21,
                LocalDate.now(), "Topic Demo", "Present",
                LocalDate.now(), "No reason", true,
                LocalDate.now()
        );

        summary.generateSummary(records);
        sc.close();
    }
}
