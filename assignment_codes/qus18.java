package assignment_codes;

class CustomRandomGenerator {
    //private long seed;
    private static int[] arr={3,5,7,11,13,17};
        long a = 1664525; // Multiplier
        long c = 12345; // Increment
        long m = 2147483647; // Modulus (2^32)
        public static int[] myRand(int n)
        {
            int[] rnd= new int[n];
            long t=System.currentTimeMillis();
    
            for(int i =0;i<n;i++){
                rnd[i]=(int)(t*arr[(int) (t%6)])%1000;
            }
        return rnd;
    }

 }
public class qus18 {
    public static void main(String[] args) {
        int[] ab=CustomRandomGenerator.myRand(5);
        for(int i=0;i<5;i++)
        System.out.println(ab[i]);

        
    }
}


    
