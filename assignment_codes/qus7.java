package assignment_codes;

import java.util.Scanner;

public class qus7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,det;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        det=b*b-4*a*c;
        if(det<=0)
        System.out.println("No real roots");
        else{
            double root1,root2;
            root1= (double)(-b+Math.sqrt(det))/(2*a);
            root2= (double)(-b-Math.sqrt(det))/(2*a);
            System.out.println("smallest positive root: "+ Math.min(root1, root2));
        }
 
        sc.close();
    }
}
