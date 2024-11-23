import java.util.ArrayList;

public class EqnSolver {

    public EqnSolver(){

    }
    public int Score;
 public int Result(String input) {
 // Input string
 //String input = "2-4/4=?#2";

 // Splitting the string into two parts at '#'
 String[] parts = input.split("#");

 // First part contains the equation
 String equation = parts[0];

 // Second part contains the score
   Score = Integer.parseInt(parts[1]);

 // Splitting the equation into components
 String[] numberParts = equation.split("([+\\-*/=])"); // Matches +, -, *, /, =
 ArrayList<Integer> numbers = new ArrayList<>();
 for (String num : numberParts) {
     if (!num.isEmpty() && !num.equals("?")) {
         numbers.add(Integer.parseInt(num));
     }
 }

 // Extracting the operators from the equation
 String operators = equation.replaceAll("[^+\\-*/]", ""); // Removes everything except operators

 // Calculate the answer
 int answer = numbers.get(0); // Start with the first number
 for (int i = 0; i < operators.length(); i++) {
     char operator = operators.charAt(i);
     int nextNumber = numbers.get(i + 1);

     switch (operator) {
         case '+':
             answer += nextNumber;
             break;
         case '-':
             answer -= nextNumber;
             break;
         case '*':
             answer *= nextNumber;
             break;
         case '/':
             if (nextNumber != 0) {
                 answer /= nextNumber;
             } else {
                 System.out.println("Error: Division by zero.");
                 //return;
             }
             break;
         default:
             System.out.println("Error: Unsupported operator.");
            // return;
     }
     //return answer;
 }
/* 
 // Display the results
 System.out.println("Equation: " + equation);
 System.out.println("Numbers: " + numbers);
 System.out.println("Operators: " + operators);
 System.out.println("Score: " + score);
 System.out.println("Answer: " + answer);
 */
 return answer;
 }
}
