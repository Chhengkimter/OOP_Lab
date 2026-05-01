package Lab06;

import java.util.Scanner;

class Math {

    int sum(int a, int b) { return a + b; }
    int sum(int a, int b, int c) { return a + b + c; }
    int sum(int[] values) {
        int total = 0;
        for (int v : values) total += v;
        return total;
    }

    int multiply(int a, int b) { return a * b; }
    int multiply(int a, int b, int c) { return a * b * c; }
    int multiply(int[] values) {
        int total = 1;
        for (int v : values) total *= v;
        return total;
    }

    int max(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= a && b >= c) return b;
        return c;
    }
    int max(int a, int b, int c, int d) {
        if (a >= b && a >= c && a >= d) return a;
        if (b >= a && b >= c && b >= d) return b;
        if (c >= a && c >= b && c >= d) return c;
        return d;
    }
    int max(int[] values) {
        int maxVal = values[0];
        for (int v : values) if (v > maxVal) maxVal = v;
        return maxVal;
    }

    int min(int a, int b, int c) {
        if (a <= b && a <= c) return a;
        if (b <= a && b <= c) return b;
        return c;
    }

    int min(int a, int b, int c, int d) {
        if (a <= b && a <= c && a <= d) return a;
        if (b <= a && b <= c && b <= d) return b;
        if (c <= a && c <= b && c <= d) return c;
        return d;
    }

    int min(int[] values) {
        int minVal = values[0];
        for (int v : values) if (v < minVal) minVal = v;
        return minVal;
    }

    double average(int a, int b, int c) { return (a + b + c) / 3.0; }
    double average(int a, int b, int c, int d) { return (a + b + c + d) / 4.0; }
    double average(int[] values) {
        int total = 0;
        for (int v : values) total += v;
        return (double) total / values.length;
    }
}

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Math math = new Math();
        int choice = 0;

        while (choice != 16) {
            System.out.println("==== Menu ===");
            System.out.println("1.  Sum of two values");
            System.out.println("2.  Sum of three values");
            System.out.println("3.  Sum of many values");
            System.out.println("4.  Multiply of two values");
            System.out.println("5.  Multiply of three values");
            System.out.println("6.  Multiply of many values");
            System.out.println("7.  Max of two values");
            System.out.println("8.  Max of three values");
            System.out.println("9.  Max of many values");
            System.out.println("10. Min of two values");
            System.out.println("11. Min of three values");
            System.out.println("12. Min of many values");
            System.out.println("13. Average of two values");
            System.out.println("14. Average of three values");
            System.out.println("15. Average of many values");
            System.out.println("16. Quit");
            System.out.print("Choose an opt: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter 2 numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt();
                    System.out.println("Output: " + math.sum(a, b));
                    break;
                }
                case 2: {
                    System.out.print("Enter 3 numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                    System.out.println("Output: " + math.sum(a, b, c));
                    break;
                }
                case 3: {
                    System.out.print("How many numbers? ");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.print("Enter numbers: ");
                    for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
                    System.out.println("Output: " + math.sum(arr));
                    break;
                }
                case 4: {
                    System.out.print("Enter 2 numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt();
                    System.out.println("Output: " + math.multiply(a, b));
                    break;
                }
                case 5: {
                    System.out.print("Enter 3 numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                    System.out.println("Output: " + math.multiply(a, b, c));
                    break;
                }
                case 6: {
                    System.out.print("How many numbers? ");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.print("Enter numbers: ");
                    for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
                    System.out.println("Output: " + math.multiply(arr));
                    break;
                }
                case 7: {
                    System.out.print("Enter 3 numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                    System.out.println("Output: " + math.max(a, b, c));
                    break;
                }
                case 8: {
                    System.out.print("Enter 4 numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
                    System.out.println("Output: " + math.max(a, b, c, d));
                    break;
                }
                case 9: {
                    System.out.print("How many numbers? ");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.print("Enter numbers: ");
                    for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
                    System.out.println("Output: " + math.max(arr));
                    break;
                }
                case 10: {
                    System.out.print("Enter 3 numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                    System.out.println("Output: " + math.min(a, b, c));
                    break;
                }
                case 11: {
                    System.out.print("Enter 4 numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
                    System.out.println("Output: " + math.min(a, b, c, d));
                    break;
                }
                case 12: {
                    System.out.print("How many numbers? ");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.print("Enter numbers: ");
                    for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
                    System.out.println("Output: " + math.min(arr));
                    break;
                }
                case 13: {
                    System.out.print("Enter 3 numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                    System.out.println("Output: " + math.average(a, b, c));
                    break;
                }
                case 14: {
                    System.out.print("Enter 4 numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
                    System.out.println("Output: " + math.average(a, b, c, d));
                    break;
                }
                case 15: {
                    System.out.print("How many numbers? ");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.print("Enter numbers: ");
                    for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
                    System.out.println("Output: " + math.average(arr));
                    break;
                }
                case 16:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
            System.out.println();
        }
        sc.close();
    }
}