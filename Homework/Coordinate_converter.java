import java.util.Scanner;

public class Coordinate_converter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose your option:");
        System.out.println("1. Polar coordinate to Cartesian coordinate");
        System.out.println("2. Cartesian coordinate to Polar coordinate");
        int opt=sc.nextInt();
        float x,y,r,th;
        if(opt==1)
        {
            System.out.println("Enter Polar coordinate( r,thita(degree) )");
            r=sc.nextFloat();
            th=sc.nextFloat();
            th=(float) (th*Math.PI/180);
            x=(float) (r*Math.cos(th));
            y=(float) (r*Math.sin(th));
            System.out.println("(x,y) = "+"("+x+","+y+")");
        }
        else if(opt==2)
        {
            System.out.println("Enter Cartesian coordinate( x,y )");
            x=sc.nextFloat();
            y=sc.nextFloat();
            r=(float) Math.sqrt(x*x+y*y);
            th=(float) Math.atan(y/x);
            th=(float) (th*180/Math.PI);
            System.out.println("(r,thita) = "+"("+r+","+th+")");

        }
        else System.out.println("wrong input");
    }
}