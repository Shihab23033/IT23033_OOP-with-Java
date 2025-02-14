package assignment_codes;

import java.math.BigInteger;
import java.util.Scanner;

public class qus14 {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        BigInteger fact =BigInteger.ONE;
        BigInteger n= new BigInteger(s);
        for(BigInteger i= BigInteger.ONE;(i.compareTo(n)<=0);i.add(BigInteger.ONE))
            fact=fact.multiply(i);
        System.out.println(fact);

        sc.close();
    }
}
