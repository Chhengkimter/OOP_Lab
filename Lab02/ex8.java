package Lab02;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input value of a: ");
        int a = input.nextInt();
        System.out.print("Input value of b: ");
        int b = input.nextInt();
        System.out.print("Input value of c: ");
        int c = input.nextInt();
        System.out.print("Input value of d: ");
        int d = input.nextInt();
        System.out.print("Input value of e: ");
        int e = input.nextInt();

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }
        if (e < min) {
            min = e;
        }
        System.out.println("The smallest number amount A, B, C, D, and E is: " + min);
    }
}
