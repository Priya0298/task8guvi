package TASK_8;

import java.util.Scanner;

public class SwapsPr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first number from the user
        System.out.println("Enter the first number:98");
        int num1 = scanner.nextInt();
        
        // Get the second number from the user
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        // Swap the values using an additional variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Print the swapped values
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        scanner.close();
    }
}