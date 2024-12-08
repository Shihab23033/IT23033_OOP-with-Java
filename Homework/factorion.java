import java.util.Scanner;

public class factorion {

    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++) f*=i;
        return f;
    }
    public static void main(String[] args) {
        int n,i,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Factorion within the range are:");
        for(i=1;i<=n;i++)
        {
            int sum=0,x=i;
            while(x!=0)
            {
                sum+=fact(x%10);
                x/=10;
            }
            if(sum==i)
            {
                c++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nThere are "+c+" factorions");
        sc.close();
    }
}