import java.util.Scanner;

public class Ch2Ex8 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        Scanner scn= new Scanner(System.in);
        String time=scn.nextLine();
        int x =Integer.parseInt(time);
        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
         long currentSecond = totalSeconds % 60;
         long totalMinutes = totalSeconds / 60;
         long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        currentHour+=x;
        // Display results
        System.out.println("Current time is " + currentHour + ":"
          + currentMinute + ":" + currentSecond + " GMT");
          scn.close();
    }
}
