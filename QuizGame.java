import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        int score=0;
        System.out.println("Welcome to Quiz Game!");
        String[][] qus= new String[100][100];
        qus[0][0]="1) What is the capital of Bangladesh?";
        qus[0][1]="a. Delhi";
        qus[0][2]="b. Dhaka";
        qus[0][3]="c. Bangkok";

        qus[1][0]="2) What is the chemical symbol for water?";
        qus[1][1]="a. H2SO4";
        qus[1][2]="b. H2O";
        qus[1][3]="c. HCl";

        qus[2][0]="3) How many days are there in a week?";
        qus[2][1]="a. 5";
        qus[2][2]="b. 6";
        qus[2][3]="c. 7";

        qus[3][0]="4) What is the best Department of MBSTU?";
        qus[3][1]="a. ICT";
        qus[3][2]="b. CSE";
        qus[3][3]="c. BGE";

        qus[4][0]="5) Which planet is known as the Red Planet?";
        qus[4][1]="a. Mars";
        qus[4][2]="b. Earth";
        qus[4][3]="c. Noakhali";

        String[] ans={"b","b","c","a","b"};
        int i,j;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            String s;
            for( j=0;j<4;j++)
            {
                System.out.println(qus[i][j]);
            }
            System.out.println("Enter your ans:(a/b/c)");
            s=sc.nextLine();
            if(ans[i].equals(s))
            {
                score+=5;
                System.out.println("Your ans is correct");
            }
            else{
                score-=1;
                System.out.println("Your ans is incorrect");
            }

        }
        System.out.println("Your score is: "+score);

    }
}
