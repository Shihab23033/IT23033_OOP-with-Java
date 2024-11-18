import java.util.Scanner;

public class Ch2Ex3 {
    public static void main(String[] args) {
        double feet,meter;
        Scanner scan= new Scanner(System.in);
        System.out.println("enter feet:");
        feet= scan.nextDouble();
        meter= feet*0.3048;
        System.out.println(feet + " feet is equal to  "+meter+" meter");
        
    }
}
