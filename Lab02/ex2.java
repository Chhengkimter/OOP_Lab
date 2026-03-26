package Lab02;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program or converting money in Riels to Dollars.");
        System.out.print("Please input conversion rate of 1 dolllar in Riels:");
        Double rate = input.nextDouble();
        System.out.print("Please input amount of money to exchange in Riels:");
        Double amount = input.nextDouble();
        Double dollars = amount / rate;
        System.out.println( amount + "RIELS = " + dollars + "USD");
    }
}
