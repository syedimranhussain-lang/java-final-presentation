import java.util.Scanner;

public class studentco2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Attendance percentage: ");
            double attendance = sc.nextDouble();

            if (attendance >= 75) {
                System.out.println("Eligible");
            } else {
                System.out.println("Short Attendance");
            }
        }
        sc.close();
    }
}
