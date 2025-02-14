package assignment_codes;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class qus1 {
    public static void main(String[] args) {
        try{
            File file= new File("D:\\Codes\\IT23033_OOP-with-Java\\assignment_codes\\Input.txt");
            Scanner scanf= new Scanner(file);
            PrintWriter printf=new PrintWriter(new File("D:\\Codes\\IT23033_OOP-with-Java\\assignment_codes\\Output.txt"));
            if(scanf.hasNextLine()){
                String x =scanf.nextLine();
                String[] s= x.split(",");
                for(int i=0;i<s.length;i++){
                    int n= Integer.parseInt(s[i]); 
                    int ssum=(n*(n+1))/2;
                    printf.print(ssum);
                    if(i!=s.length-1)
                    printf.print(", ");
                }
            }
            scanf.close();
            printf.close();
            System.out.println("File written successfully");
        }
        catch(Exception e){
            System.out.println("File not found");
        }
    } 
}

