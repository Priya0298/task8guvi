package TASK_8;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the number from the user
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        //Calculate the factional of the number
        long factorial = calculateFactorial(number);

        //Print the factorial
        System.out.println(number + "! =" + factorial);
        scanner.close();
    }
    //Function to calculate the factorial of a number
    public static long calculateFactorial(int number){
        if (number < 0) {
            throw new  IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        //Base case: factorial of o is 1
        if (number == 0) {
            return 1;
        }
        //Calculate factorial iteratively
        long result = 1;
        for (int i = 1; i <= number; i++){
            result *= i;
        }
        return result;

        }
        }
        