package assignment_codes;

public class qus5 {
    public static int ArraySum(int[] arr){
        int sum=0;
        for(int i:arr)
        sum+=i;
        return sum;
    }
    public static void main(String[] args) {
        int[] array={1,2,4,6,8,90,34};
        System.out.println("sum of array: "+ArraySum(array));
    }
}
