import java.util.Scanner;
public class Ch2Ex6 {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 1000:");
        int n;
        Scanner scan= new Scanner(System.in);
        n=scan.nextInt();
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        scan.close();
        System.out.println("The sum of the digits is "+ sum);
    }
}
