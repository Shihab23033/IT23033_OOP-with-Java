package assignment_codes;

import java.math.BigInteger;
import java.util.Scanner;

public class qus14 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        BigInteger fact =BigInteger.ONE;
       // BigInteger m =BigInteger.ONE;
        for(int i=1;i<=n;i++)
        {
            fact=fact.multiply(BigInteger.valueOf(i));
           // m=m.add(BigInteger.ONE);
        }
        System.out.println(fact);
        sc.close();
    }
}
