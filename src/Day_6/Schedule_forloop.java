package Day_6;

public class Schedule_forloop {
    public static void main(String[] args) {
        for (int week = 1; week <= 4; week++) {
            for (int day = 1; day <= 7; day++) {
                System.out.println( "week" + week + "day" + day);
                System.out.println("  come to college" + " study and go to home");
            }
        }
    }
}
