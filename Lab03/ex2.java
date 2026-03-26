package Lab03;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        int max = 0;
        int min = 0;
        double average = 0.0;

        System.out.print("How many numbers to be input?: ");
        n = scanner.nextInt();
        int[] input = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
            sum += input[i];
        }
        average = (double) sum / n;
        max = input[0];
        min = input[0];
        for (int i = 1; i < n; i++) {
            if (input[i] > max) {
                max = input[i];
            }
            if (input[i] < min) {
                min = input[i];
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
