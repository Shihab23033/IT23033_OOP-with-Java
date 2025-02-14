package assignment_codes;

class BaseClass {
    void printResult(String operation, String result) {
        System.out.println(operation + " = " + result);
    }
}

class SumClass extends BaseClass {
    void SeriesSum() {
        double sum = 0.0;
        for (double i = 1.0; i >= 0.1; i -= 0.1) {
            sum += i;
        }
        printResult("Sum of series", String.valueOf(sum));
    }
}

class DivisorMultipleClass extends BaseClass {
    
    void GCDandLCM(int a,int b){
        printResult("GCD of " + a + " and " + b, String.valueOf(GCD(a,b)));
        printResult("LCM of " + a + " and " + b, String.valueOf(LCM(a,b)));

    }

    int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
    
    int LCM(int a, int b) {
        int lcm= (a*b)/GCD(a,b);
        return lcm;
    }
}

class NumberConversionClass extends BaseClass {
    void convertNumber(int number) {
        String b = Integer.toBinaryString(number);
        String h = Integer.toHexString(number);
        String o = Integer.toOctalString(number);

        printResult("Binary of " + number, b);
        printResult("Hexadecimal of " + number, h);
        printResult("Octal of " + number, o);
    }
}

class CustomPrintClass extends BaseClass {
    void pr(String message) {
        System.out.println( message);
    }
}

public class qus12 {
    public static void main(String[] args) {
        SumClass sum = new SumClass();
        DivisorMultipleClass gcdlcm = new DivisorMultipleClass();
        NumberConversionClass base = new NumberConversionClass();
        CustomPrintClass cp = new CustomPrintClass();

        sum.SeriesSum(); 
        gcdlcm.GCDandLCM(12, 18);
        base.convertNumber(255);
        cp.pr("This is a custom print message!"); 
    }
}
