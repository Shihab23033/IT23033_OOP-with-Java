package assignment_codes;

class CustomRandomGenerator {

    private static int[] arr={3,5,7,11,13,17};
        public static int[] myRand(int n)
        {
            int[] rnd= new int[n];
            long t=System.currentTimeMillis();
    
            for(int i =0;i<n;i++){
                rnd[i]=(int)(t*arr[i%6])%1000;
            }
        return rnd;
    }

 }
public class qus18 {
    public static void main(String[] args) {
        int[] ab=CustomRandomGenerator.myRand(10);
        for(int i=0;i<10;i++)
        System.out.println(ab[i]);

        
    }
}


    
