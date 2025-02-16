package assignment_codes;

 class ExtremeFinder {

    public static int findExtreme(String type, int... numbers) { // int.. is called varargs(variable argument)
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number must be provided.");
        }

        int x = numbers[0]; 

        if (type.equals("smallest")) {
            for (int num : numbers) {
                if (num < x) {
                    x = num;
                }
            }
        } else if (type.equals("largest")) {
            for (int num : numbers) {
                if (num > x) {
                    x = num;
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid type. Use 'smallest' or 'largest'.");
        }

        return x;
    }
}

public class qus33{
    public static void main(String[] args) {
        int x = ExtremeFinder.findExtreme("smallest", 5, 2, 9, 1);
        int y = ExtremeFinder.findExtreme("largest", 8, 3, 10, 4);

        System.out.println("Smallest: " + x); 
        System.out.println("Largest: " + y); 
    }
}
