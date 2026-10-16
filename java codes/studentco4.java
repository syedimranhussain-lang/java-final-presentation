class Studentco4 {
    private String name;
    private double attendance;
    private int marks;

    Studentco4(String name, double attendance, int marks) {
        this.name = name;
        this.attendance = attendance;
        this.marks = marks;
    }

    public void displayReport() {
        System.out.println("Name: " + name);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Marks: " + marks);
    }
}

public class CO4Tracker {
    public static void main(String[] args) {
        Student s = new Student("Asha", 90.0, 420);
        s.displayReport();
    }
}
