import java.util.Scanner;

public class Ch2Ex7 {
    public static void main(String[] args) {
        int min,n;
        System.out.println(" Enter the number of minutes: ");
        Scanner scan=new Scanner(System.in);
        n= scan.nextInt();
        min=n/1440;
        int day,year;
        year=(int) (min/365);
        day=(int) (min%365);
        System.out.print(n+" minutes is approximately "+year+" years and "+day+"  days");
        scan.close();
    }
}
