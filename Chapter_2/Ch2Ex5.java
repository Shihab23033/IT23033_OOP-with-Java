import java.util.Scanner;

public class Ch2Ex5 {
    public static void main(String[] args) {
        double subtotal,gratuity,grat,total;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println(" Enter the subtotal and a gratuity rate:");
            subtotal= scan.nextDouble();
            gratuity= scan.nextDouble();
        }
        grat= (gratuity/100)*subtotal;
        total=grat+subtotal;
        System.out.println("The gratuity is $"+grat+ "  and total is $"+ total);
    }
}
