import java.util.Scanner;
public class UniversityGradeAttendanceTracker {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int students;
    int i = 1;

    System.out.print("Enter number of students: ");
    students = sc.nextInt();

    while (i <= students) {

        System.out.println("\n===== Student " + i + " =====");

        System.out.print("Enter student name: ");
        String name = sc.next();

        // Enter marks
        System.out.print("Enter marks for Subject 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int mark3 = sc.nextInt();

        // Calculate total and percentage
        int total = mark1 + mark2 + mark3;
        double percentage = total / 3.0;

        // Grade calculation
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Attendance
        System.out.print("Enter total classes conducted: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int attendedClasses = sc.nextInt();

        double attendance = (attendedClasses * 100.0) / totalClasses;

        // Attendance status
        String attendanceStatus;

        if (attendance >= 75) {
            attendanceStatus = "Eligible";
        } else {
            attendanceStatus = "Shortage";
        }

        // Pass/Fail
        String result;

        if (percentage >= 50 && attendance >= 75) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        // Display student details
        System.out.println("\n----- Student Report -----");
        System.out.println("Student Name       : " + name);
        System.out.println("Total Marks        : " + total + "/300");
        System.out.println("Percentage         : " + percentage + "%");
        System.out.println("Grade              : " + grade);
        System.out.println("Attendance         : " + attendance + "%");
        System.out.println("Attendance Status  : " + attendanceStatus);
        System.out.println("Final Result       : " + result);

        i++;
    }

    System.out.println("\n===== Tracker Completed =====");

    sc.close();
}
}