package assignment_codes;

import java.util.Scanner;

public class qus30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array 1");
        int n=sc.nextInt();
        int[] arr1= new int[n];
        for(int i = 0;i<n;i++) arr1[i]=sc.nextInt();
        int m;
        if(n%2!=0) m=n/10+1;
        else m=n/10;
        int[] arr2= new int[m];
        System.out.println("enter "+m + " numbers for array 2:");
        for(int i = 0;i<m;i++) arr2[i]=sc.nextInt();
        System.out.println("\nhere are the results:");
        for(int i:arr1){
            for(int j:arr2){
                double div= (double) i/j;
                int rem= i%j;
                System.out.println("divisor and reminder of "+i +" and "+j+" is: "+div+", "+rem );
            }
        }

        sc.close();
    }
}
