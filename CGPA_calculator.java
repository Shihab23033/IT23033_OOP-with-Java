import java.util.Scanner;

public class CGPA_calculator {
    public static float grade(float marks)
    {
        if (marks >= 80 && marks <= 100) {
            return 4.00f;
        } else if (marks >= 75 && marks < 80) {
            return 3.75f;
        } else if (marks >= 70 && marks < 75) {
            return 3.50f;
        } else if (marks >= 65 && marks < 70) {
            return 3.25f;
        } else if (marks >= 60 && marks < 65) {
            return 3.00f;
        } else if (marks >= 55 && marks < 60) {
            return 2.75f;
        } else if (marks >= 50 && marks < 55) {
            return 2.50f;
        } else if (marks >= 45 && marks < 50) {
            return 2.25f;
        } else if (marks >= 40 && marks < 45) {
            return 2.00f;
        } else if (marks >= 0 && marks < 40) {
            return 0.00f;
        }
        else return 0;
        
    }

    public static String grade_str(float cgpa) {
        if (cgpa == 4.00) {
            return "A+";
        } else if (cgpa >= 3.75 && cgpa < 4.00) {
            return "A";
        } else if (cgpa >= 3.50 && cgpa < 3.75) {
            return "A-";
        } else if (cgpa >= 3.25 && cgpa < 3.50) {
            return "B+";
        } else if (cgpa >= 3.00 && cgpa < 3.25) {
            return "B";
        } else if (cgpa >= 2.75 && cgpa < 3.00) {
            return "B-";
        } else if (cgpa >= 2.50 && cgpa < 2.75) {
            return "C+";
        } else if (cgpa >= 2.25 && cgpa < 2.50) {
            return "C";
        } else if (cgpa >= 2.00 && cgpa < 2.25) {
            return "D";
        } else if (cgpa < 2.00) {
            return "F";
        } else {
            return "F";
        }
    }
    public static void main(String[] args) {
        System.out.println("Student ID:");
        Scanner sc=new Scanner(System.in);
        String id= sc.nextLine();
        System.out.println("No. of Courses:");
        int n=sc.nextInt(),i=1;
        float cradit,ct,at,fm,total;
        int cradit_sum=0,total_cradit=0;
        float grade_sum=0;
        while(n!=0)
        {
            n--;
            System.out.println("Course no "+i++);
            System.out.println("Credit (Max 3):");
            cradit=sc.nextFloat();
            System.out.println("CT (Max 30):");
            ct=sc.nextFloat();
            System.out.println("AT (Max 10):");
            at=sc.nextFloat();
            System.out.println("FE (Max 60):");
            fm=sc.nextFloat();
            total=fm+at+ct;
            float grt=grade(total);
            if(grt!=0)
            cradit_sum+=cradit;
            total_cradit+= cradit;
            grade_sum+=(grt*cradit);

        }
        float cgpa=grade_sum/(float)total_cradit;

        System.out.println("Student ID: "+id);
        System.out.println("Credit Taken: "+total_cradit);
        System.out.println("Credit Earned: "+ cradit_sum);
        System.out.println("CGPA: "+ cgpa);
        System.out.println("Grade: "+ grade_str(cgpa));
        sc.close();
    }
}