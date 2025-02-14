package assignment_codes;

import java.util.Scanner;

public class qus8
  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println(ch + " is a Letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit.");
        } else if (Character.isWhitespace(ch)) {
            System.out.println("It is a Whitespace character.");
        } else {
            System.out.println(ch + " is a Special character.");
        }

        sc.close();
    }
}
