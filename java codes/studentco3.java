public class studentco3 {
    static double percentage(int present, int total) {
        if (total <= 0) return 0;
        return present * 100.0 / total;
    }

    public static void main(String[] args) {
        int[] presentDays = {18, 14, 20};
        int totalDays = 20;

        for (int i = 0; i < presentDays.length; i++) {
            double p = percentage(presentDays[i], totalDays);
            System.out.printf("Student %d: %.1f%%%n", i + 1, p);
        }
    }
}
