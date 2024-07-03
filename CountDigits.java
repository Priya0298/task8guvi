package TASK_8;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //Prompt the user to enter an integer
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        //Convert the number to its absolute value to handle negative numbers
        int absoluteNumber = Math.abs(number);
        
        //Count the number of digits using a loop
        int digitCount = 0;
        while(absoluteNumber > 0 ){
            absoluteNumber /= 10;
            digitCount++;
        }
          System.out.println("Number of digits: " + digitCount);
          scanner.close();
    }
    
}