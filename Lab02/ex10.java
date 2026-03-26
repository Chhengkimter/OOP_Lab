package Lab02;
import java.util.Scanner;

public class ex10 {

    public static void displayMenu() {
        System.out.println("=== Math Menu ===");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (x)");
        System.out.println("4. Division (/)");
        System.out.println("5. Quit");
        System.out.print("Please choose an option (1-5): ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int choice = 0;
        do {
            displayMenu();
            choice = input.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = input.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = input.nextDouble();
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = input.nextDouble();
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = input.nextDouble();
                    if(num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while(choice != 5);
        input.close();
    }    
}
