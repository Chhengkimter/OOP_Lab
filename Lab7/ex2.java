package Lab7;

import java.util.Scanner;
import java.lang.Math;
abstract class NumberRandomizer {
    abstract int randomizeInBetween(int min, int max);
    abstract int[] randomizeUniqueInBetween(int min, int max, int amount);
}

class Randomizer extends NumberRandomizer {

    @Override
    int randomizeInBetween(int min, int max) {
        return min + (int)(Math.random() * (max - min + 1));
    }

    @Override
    int[] randomizeUniqueInBetween(int min, int max, int amount) {
        int[] result = new int[amount];
        int count = 0;

        while (count < amount) {
            int num = min + (int)(Math.random() * (max - min + 1));

            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (result[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result[count] = num;
                count++;
            }
        }
        return result;
    }
}

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Randomizer rand = new Randomizer();
        int choice = 0;

        while (choice != 3) {
            System.out.println("==== Number Randomizer ===");
            System.out.println("1. In between");
            System.out.println("2. Unique in between");
            System.out.println("3. Quit");
            System.out.print("Choose an opt: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter min: ");
                    int min = sc.nextInt();
                    System.out.print("Enter max: ");
                    int max = sc.nextInt();
                    System.out.println("Result: " + rand.randomizeInBetween(min, max));
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.print("Enter min: ");
                    int min = sc.nextInt();
                    System.out.print("Enter max: ");
                    int max = sc.nextInt();
                    System.out.print("How many unique numbers: ");
                    int amount = sc.nextInt();

                    if (amount > (max - min + 1)) {
                        System.out.println("Error: amount exceeds the range!");
                        break;
                    }

                    int[] results = rand.randomizeUniqueInBetween(min, max, amount);
                    System.out.print("Result: ");
                    for (int i = 0; i < results.length; i++) {
                        System.out.print(results[i]);
                        if (i < results.length - 1) System.out.print(", ");
                    }
                    System.out.println("\n");
                    break;
                }
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option, try again.\n");
            }
        }
        sc.close();
    }
}