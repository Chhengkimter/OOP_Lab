package Lab02;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find x when 1/x = 1/y + 1/z:");
        System.out.print("Enter y: ");
        double y = sc.nextDouble();
        System.out.print("Enter z: ");
        double z = sc.nextDouble();

        double x = 1 / ((1 / y) + (1 / z));
        System.out.println("x = " + x);
    }
}
