package TASK_8;

import java.util.Scanner;

public class Primechecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the number from the user
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        //Check if the number is prime
        boolean isprime = checkprime(number);

        //Print the result
        if (isprime){
            System.out.println(number + "is a prime number.");
            }else{
                System.out.println(number + "is not a prime number.");
            }
            scanner.close();
        }
        //Function to check if a number is prime 
        public static boolean checkprime(int number){
            //0 and 1 are not prime numbers
            if (number <= 1) {
                return false;
            }
            //Check divisibility from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++){
                if (number % i == 0){
                    return false; // If divisible, the number is not prime
                }
            }
            return true; //If not divisible, the number is prime
        }
        




    }
    