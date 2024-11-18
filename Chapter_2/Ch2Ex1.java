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
 * 
 */