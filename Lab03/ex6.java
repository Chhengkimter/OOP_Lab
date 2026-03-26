package Lab03;
import java.util.Scanner;

class Math {
    int factorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }
    double rectSurface(double a, double b) {
        return a * b;
    }
    double circleSurface(double r) {
        return java.lang.Math.PI * r * r;
    }
    double max(double a, double b, double c, double d, double e) {
        return java.lang.Math.max(a, java.lang.Math.max(b, java.lang.Math.max(c, java.lang.Math.max(d, e))));
    }
    double min(double a, double b, double c, double d, double e) {
        return java.lang.Math.min(a, java.lang.Math.min(b, java.lang.Math.min(c, java.lang.Math.min(d, e))));
    }
}
public class ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Math obj = new Math();
        
        while(true){
            System.out.println("1. Factorial\n2. Rectangle Surface\n3. Circle Surface\n4. Max\n5. Min\n6. Exit\nEnter your choice: ");
            int choice = sc.nextInt();
            if(choice == 6){
                break;
            }
            switch(choice){
                case 1:
                    System.out.println("Enter a number: ");
                    int num = sc.nextInt();
                    System.out.println(obj.factorial(num));
                    break;
                case 2:
                    System.out.println("Enter two numbers: ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    System.out.println(obj.rectSurface(a, b));
                    break;
                case 3:
                    System.out.println("Enter a number: ");
                    double r = sc.nextDouble();
                    System.out.println(obj.circleSurface(r));
                    break;
                case 4:
                    System.out.println("Enter five numbers: ");
                    double a1 = sc.nextDouble();
                    double b1 = sc.nextDouble();
                    double c1 = sc.nextDouble();
                    double d1 = sc.nextDouble();
                    double e1 = sc.nextDouble();
                    System.out.println(obj.max(a1, b1, c1, d1, e1));
                    break;
                case 5:
                    System.out.println("Enter five numbers: ");
                    double a2 = sc.nextDouble();
                    double b2 = sc.nextDouble();
                    double c2 = sc.nextDouble();
                    double d2 = sc.nextDouble();
                    double e2 = sc.nextDouble();
                    System.out.println(obj.min(a2, b2, c2, d2, e2));
                    break;
            }
        }
        sc.close();
    }    
}
