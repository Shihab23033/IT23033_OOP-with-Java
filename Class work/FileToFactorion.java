import java.io.File;
import java.util.Scanner;

public class FileToFactorion {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++) f*=i;
        return f;
    }
    public static void main(String[] args) {
        int n,i;
        try {
            File file=new File("D:\\Codes\\IT23033_OOP-with-Java\\Class work\\range.txt");
            Scanner fsc=new Scanner(file);
            while(fsc.hasNext()){
                int c=0;
                n=fsc.nextInt();
                System.out.println("\nrange is 1 to "+n);
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
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
