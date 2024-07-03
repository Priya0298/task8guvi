package TASK_8;
import java.util.Scanner;

public class CheckPro {
    public static void main(String[] checkpro) {
        Scanner scanner = new Scanner (System.in);

        //Prompt the user to enter their age
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        //Check if the person is a senior citizen 
        if (age >= 60){
            System.out.println("You are a senior citizen.");
        }else{
            System.out.println("You are not a senior citizen.");

        }
        scanner.close();

        }
        
    }
    
