package assignment_codes;

import java.util.Scanner;

public class qus3 {

    public static void main(String[] args) {
        int s,e,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        s=sc.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        e=sc.nextInt();
        System.out.println("Factorion within the range are:");
        for(i=s;i<=e;i++)
        {
            int sum=0,x=i;
            while(x!=0)
            {
                sum+=fact(x%10);
                x/=10;
            }
            if(sum==i)
            {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++) f*=i;
        return f;
    }
}
