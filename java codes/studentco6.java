import java.io.FileWriter;
import java.io.IOException;

public class studentco6 {
    public static void main(String[] args) {
        String name = "Asha";
        double attendance = 90.0;
        int marks = 420;

        try (FileWriter writer =
                 new FileWriter("student_report.txt")) {
            writer.write("Name: " + name + "\n");
            writer.write("Attendance: " + attendance + "%\n");
            writer.write("Marks: " + marks + "\n");
            System.out.println("Report saved.");
        } catch (IOException e) {
            System.out.println("Could not save report.");
        }
    }
}
