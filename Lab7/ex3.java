package Lab7;

import java.util.Random;
import java.util.Scanner;

abstract class TextRandomizer {
    abstract char randomizeACharacter();
    abstract String randomizeAString(int length);
    abstract String[] randomizeStrings(int length, int amount);
}

class MyTextRandomizer extends TextRandomizer {
    private Random random = new Random();

    @Override
    public char randomizeACharacter() {
        return (char) ('a' + random.nextInt(26));
    }

    @Override
    public String randomizeAString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(randomizeACharacter());
        }
        return sb.toString();
    }

    @Override
    public String[] randomizeStrings(int length, int amount) {
        String[] result = new String[amount];
        for (int i = 0; i < amount; i++) {
            result[i] = randomizeAString(length);
        }
        return result;
    }
}

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyTextRandomizer randomizer = new MyTextRandomizer();

        System.out.println("==== Text Randomizer ===");
        System.out.println("1.  A Character");
        System.out.println("2.  A String");
        System.out.println("3.  Unique Strings");
        System.out.print("Choose an opt: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Random Character: " + randomizer.randomizeACharacter());
                break;
            case 2:
                System.out.print("Enter string length: ");
                int strLength = scanner.nextInt();
                System.out.println("Random String: " + randomizer.randomizeAString(strLength));
                break;
            case 3:
                System.out.print("Enter string length: ");
                int length = scanner.nextInt();
                System.out.print("Enter amount: ");
                int amount = scanner.nextInt();
                String[] strings = randomizer.randomizeStrings(length, amount);
                System.out.println("Random Strings:");
                for (int i = 0; i < strings.length; i++) {
                    System.out.println("  [" + (i + 1) + "] " + strings[i]);
                }
                break;
            default:
                System.out.println("Invalid option.");
        }

        scanner.close();
    }
}