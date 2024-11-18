import java.util.Scanner;

public class Ch2Ex4 {
    public static void main(String[] args) {
        double pound,kilo;
        Scanner scan= new Scanner(System.in);
        System.out.println("enter pound:");
        pound= scan.nextDouble();
        kilo= pound*0.454;
        System.out.println(pound + " feet is equal to  "+kilo+" kilograms");
        
    }
}
