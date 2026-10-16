import java.util.Scanner;

public class studentco1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student name: ");
        String name = sc.nextLine();
        System.out.print("Days present: ");
        int present = sc.nextInt();
        System.out.print("Total working days: ");
        int total = sc.nextInt();

        if (total > 0 && present >= 0 && present <= total) {
            double percent = present * 100.0 / total;
            System.out.println("Student: " + name);
            System.out.printf("Attendance: %.1f%%%n", percent);
        } else {
            System.out.println("Enter valid attendance values.");
        }
        sc.close();
    }
}
