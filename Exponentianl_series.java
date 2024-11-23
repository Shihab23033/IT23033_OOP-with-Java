import java.util.Scanner;
public class Exponentianl_series {
    public static long fact(int n){
            int ans=1;
            for(int i=1;i<=n;i++)
            ans*=i;
            return ans;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x= sc.nextInt();
            int n=10;
            float ssum=0;
            for(int i=0;i<=n;i++)
            {
                ssum+=(float) (Math.pow(x, i)/fact(i));
        }
        System.out.println("e^"+x+" = "+ssum);
        sc.close();
    }
}
