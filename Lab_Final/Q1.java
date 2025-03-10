package Lab_Final;

import java.util.Arrays;

public class Q1 {
    static void reverse(float[] arr) {
        int l = 0,r = arr.length-1;
        while (l < r) {
            float temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        float[] arr = {5.8f, 2.6f, 9.0f, 3.4f, 7.1f};

        System.out.println("Original array: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
