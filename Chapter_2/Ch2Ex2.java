import java.util.Scanner;

public class Ch2Ex2 {
    public static void main(String[] args) {
        double rad,len,area,volume;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("enter radius:");
            rad= scan.nextDouble();
            System.out.println("enter length:");
            len= scan.nextDouble();
        }
        area= 3.14159*rad*rad;
        volume= area*len;
        System.out.println("Area of the cylinder: "+area);
        System.out.println("Volume of the cylinder: "+volume);
        
    }
}
