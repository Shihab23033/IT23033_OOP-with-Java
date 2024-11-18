import java.util.Scanner;
public class Ch2Ex1 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double cel=scan.nextDouble();
            double fer=(9.0/5)*cel+32;
            System.out.println(cel+" degree Celcious is equal to "+fer+" degree Fahrenheit");
        } 
    }
    
}

/*
 * long totalMilliseconds = System.currentTimeMillis();
 
        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
 
        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;
 
        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;
 
        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;
         // Obtain the total hours
        long totalHours = totalMinutes / 60;
 
       // Compute the current hour
        long currentHour = totalHours % 24;
 
        // Display results
        System.out.println("Current time is " + currentHour + ":"
          + currentMinute + ":" + currentSecond + " GMT");
 */