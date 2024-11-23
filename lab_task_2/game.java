import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;    
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class game {
    public static void main(String[] args) {
        String eqn;
        int res,input;
        boolean ans;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Welcome to Shihab for Kids game, " + name + "!");
    while(true){
        int score = 0;
        System.out.println("Choose difficulty level:(1/2/3) ");
        System.out.println("1. Beginner\n" + "2. medium\n" + "3. Advance");
        int difficulty = scan.nextInt();
        if( difficulty == 1 )
        {
           // try // (Scanner fsc = new Scanner(new File("D:\Codes\iiii\chap1\Beginner.txt")))
             try{
                File file=new File("Beginner.txt");
                Scanner fsc= new Scanner(file);
                while(fsc.hasNext()){
                    eqn=fsc.nextLine();
                    System.out.println(eqn.substring(0,eqn.length()-2));
                    EqnSolver obj=new EqnSolver();
                    res = obj.Result(eqn);
                    input = scan.nextInt();
                    ans= res==input;
                    if(ans)
                    {
                        score+=obj.Score;
                    }

                    if(ans)
                    System.out.println("Your ans is correct");
                    else {
                        System.out.println("Your ans is incorrect");
                        System.out.println("correct answer: "+res);
                    }
                }
                fsc.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else if (difficulty == 2)
        {
            try{
                File file=new File("Medium.txt");
                Scanner fsc= new Scanner(file);
                while(fsc.hasNext()){
                    eqn=fsc.nextLine();
                    System.out.println(eqn.substring(0,eqn.length()-2));
                    EqnSolver obj=new EqnSolver();
                    res = obj.Result(eqn);
                    input = scan.nextInt();
                    ans= res==input;
                    if(ans)
                    {
                        score+=obj.Score;
                    }
                    if(ans)
                    System.out.println("Your ans is correct");
                    else {
                        System.out.println("Your ans is incorrect");
                        System.out.println("correct answer: "+res);
                    }
                }
                fsc.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else 
        {
            try{
                File file=new File("Advance.txt");
                Scanner fsc= new Scanner(file);
                while(fsc.hasNext()){
                    eqn=fsc.nextLine();
                    System.out.println(eqn.substring(0,eqn.length()-2));
                    EqnSolver obj=new EqnSolver();
                    res = obj.Result(eqn);
                    input = scan.nextInt();
                    ans= res==input;
                    if(ans)
                    {
                        score+=obj.Score;
                    }
                    if(ans)
                    System.out.println("Your ans is correct");
                    else {
                        System.out.println("Your ans is incorrect");
                        System.out.println("correct answer: "+res);
                    }
                }
                fsc.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name+" your score is: "+score+"/"+difficulty*10);
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        try{
            FileWriter fpr= new FileWriter("History.txt", true);
            fpr.write(name + " " + score + " " + currentDate + " " + formattedTime + " ");
            if(difficulty==1) fpr.write("Beginner\n");
            else if(difficulty==2) fpr.write("Medium\n");
            else fpr.write("Advance\n");
            fpr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(name + " " + score + " " + currentDate + " " + formattedTime + " " + difficulty);
        System.out.println("Do you want to play again?\n" + "1.Yes\n2.No\n3. History");
        int check = scan.nextInt();
        if(check == 2)break;
        if(check==3){
            try {
                Scanner sc= new Scanner(new File("History.txt"));
                while (sc.hasNext()) {
                    String history=sc.nextLine();
                    System.out.println(history);
                }
                
                sc.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    System.out.println("Thank you for playing, " + name + "!");
    scan.close();
    }
}

