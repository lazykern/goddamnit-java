import java.time.Duration;
import java.util.Scanner;

public class ParkingTicket {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";

    // Constructor for testing
    public ParkingTicket() {
    }

    public static int parseTime(String time) {
        int inp_hour = Integer.valueOf(time.substring(0, 2));
        int inp_minuite = Integer.valueOf(time.substring(2, 4));

        return inp_hour * 60 + inp_minuite;
    }

    public static void visualize(int hour, int minute) {

        System.out.println();

        for (int i = 1; i <= hour; ++i) {
            System.out.println(
                    ANSI_GREEN + "=====" + ANSI_YELLOW + "===" + ANSI_RED + "==" + ANSI_RESET + " | " + i + " hours");
        }

        if (minute > 0) {

            int scaled_min = minute / 6;
            if (scaled_min == 0) scaled_min = 1;

            for (int i = 1; i <= scaled_min; ++i) {
                if (i <= 4) {
                    System.out.print(ANSI_GREEN + "=");
                } else if (i <= 7) {
                    System.out.print(ANSI_YELLOW + "=");
                } else if (i <= 10) {
                    System.out.print(ANSI_RED + "=");
                }
            }

            for (int i = 0; i < 10 - scaled_min; ++i) {
                System.out.print(" ");
            }

            System.out.print(ANSI_RESET + " | " + minute + " minutes\n");

        }

        System.out.println();

    }

    public static int calculateFee(int hour, int minute) {

        int total_fee = (hour > 0) ? 10 : 0;

        if (hour > 2)
            total_fee += (hour - 2) * 40;
        if (minute > 0)
            total_fee += 40;

        return total_fee;
    }

    public static void printParkingDuration(String enterTime, String leaveTime) {
        int total_minuite = parseTime(leaveTime) - parseTime(enterTime);

        int hour = total_minuite / 60;
        int minute = total_minuite % 60;

        System.out.printf("Parking duration: %d hours and %d minutes\n", hour, minute);

    }

    public static void printParkingFee(int hour, int minute) {
        System.out.println("Total parking fee: " + calculateFee(hour, minute) + " Baht");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entering time -> ");
        String enterTime = sc.nextLine();

        System.out.print("Leaving time -> ");
        String leaveTime = sc.nextLine();
        
        int total_minuite = (leaveTime.contains("(overnight)")) ? 1440 - parseTime(enterTime) + parseTime(leaveTime) : parseTime(leaveTime) - parseTime(enterTime);

        int hour = total_minuite / 60;
        int minute = total_minuite % 60;

        System.out.printf("Parking duration: %d hours and %d minutes\n", hour, minute);

        visualize(hour, minute);

        printParkingFee(hour, minute);
    }
}