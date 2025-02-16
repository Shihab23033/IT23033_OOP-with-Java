package assignment_codes;

import java.text.SimpleDateFormat;
import java.util.Date;


public class qus31 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = new Date();
        System.out.println("Current date and time: " + sdf.format(now));
        //System.out.println(now);
    }
}
