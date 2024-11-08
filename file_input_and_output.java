//Reading from a file and Writing on another file
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class file_input {
    public static void main(String[] args){
        try{
            
            Scanner scanf= new Scanner(new File("TestCase.txt"));
            PrintWriter writef= new PrintWriter(new File("Output.txt"));
            while(scanf.hasNext()){
                int n= scanf.nextInt();
               // System.out.println(x);
                int i,sum=0;
                for(i=1;i<=n;i++)
                {
                    sum+=i;
                    writef.print(i);
                    if(i!=n)
                    writef.print("+");
                }
                writef.println("="+ sum);
            }
            System.out.println("file written successfully");
            scanf.close();
            writef.close();
        }catch(Exception e){
            System.out.println("File not found");
        }


    }
    
}
// Md. Shihabul Islam(it23033)
