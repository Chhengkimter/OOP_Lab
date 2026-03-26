package Lab02;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number to check whether it is a prime number: ");
        int num = input.nextInt();
        input.close();
        
        if (num>=1){
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number, because it is divisible by " + i + ".");
                    return;
                }
            }
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
