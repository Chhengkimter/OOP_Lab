package Lab06;
import java.util.Scanner;

class AbstractMath {
    int reverseNumber(int num) {
        return 0;
    }

    int roundedNumber(double num) {
        return 0;
    }

    int countDistinct(int[] values) {
        return 0;
    }

    int decimalToBinary(int decimal) {
        return 0;
    }
}

class Math extends AbstractMath {

    @Override
    int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    @Override
    int roundedNumber(double num) {
        int intPart = (int) num;
        double decimal = num - intPart;
        if (decimal >= 0.5) {
            return intPart + 1;
        } else {
            return intPart;
        }
    }

    @Override
    int countDistinct(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (values[i] == values[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                count++;
            }
        }
        return count;
    }

    @Override
    int decimalToBinary(int decimal) {
        int binary = 0;
        int place = 1;
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = binary + (remainder * place);
            decimal /= 2;
            place *= 10;
        }
        return binary;
    }
    
}
public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Math math = new Math();
        int choice = 0;

        while(true) {
           System.out.println("==== Menu ===");
            System.out.println("1. Reverse a number");
            System.out.println("2. Rounded number");
            System.out.println("3. Count distinct number");
            System.out.println("4. Decimal to Binary");
            System.out.println("5. Quit");
            System.out.print("Choose an opt: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\n::: Reverse a number :::\nInput number: ");
                    int num1 = sc.nextInt();
                    System.out.println("Output is: " + math.reverseNumber(num1));
                    break;
                case 2:
                    System.out.print("\n::: Rounded number :::\nInput number: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Output is: " + math.roundedNumber(num2));
                    break;
                case 3:
                    System.out.print("\n::: Count distinct number :::\nHow many numbers? ");
                    int size = sc.nextInt();
                    int[] arr = new int[size];
                    System.out.print("Input numbers: ");
                    for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
                    System.out.println("Output is: " + math.countDistinct(arr));
                    break;
                case 4:
                    System.out.print("\n::: Decimal to Binary :::\nInput number: ");
                    int num4 = sc.nextInt();
                    System.out.println("Output is: " + math.decimalToBinary(num4));
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option, try again.");
            }
            System.out.println();
        }
    }
}
