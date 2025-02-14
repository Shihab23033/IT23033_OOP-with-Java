package assignment_codes;

import java.util.Scanner;

public class qus10 {
    public static void main(String[] args) {
        String s;
        Scanner sc= new Scanner(System.in);
        s=sc.nextLine();
        int l=0,r=s.length()-1;
        boolean flag=true;
       while(l<r){
            if(s.charAt(l) !=s.charAt(r)){
                flag=false;
            }
            l++;
            r--;
        }
        if(flag){
            System.out.println("palindrome");
        }
        else 
        System.out.println("not palindrome");
        sc.close();
    }
}
