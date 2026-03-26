package Lab03;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Program for calculating roots of quadratic equation ax^2 + bx + c = 0\n");
        System.out.print("Input a: ");
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();
        System.out.print("Input c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + java.lang.Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - java.lang.Math.sqrt(discriminant)) / (2 * a);
            System.out.print("Two distinct real roots: " + root1 + " and " + root2 + "\n");
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.print("One real root: " + root + "\n");
        } else {
            System.out.print("No real roots.\n");
        }
    }
}