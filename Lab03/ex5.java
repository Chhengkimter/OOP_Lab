package Lab03;
import java.util.Scanner;

public class ex5 {

    static class Math{
        double add(double a, double b){
            return a + b;
        }
        double sub(double a, double b){
            return a - b;
        }
        double mul(double a, double b){
            return a * b;
        }
        double div(double a, double b){
            return a / b;
        }
        double min(double a, double b){
            return java.lang.Math.min(a, b);
        }
        double max(double a, double b){
            return java.lang.Math.max(a, b);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Math obj = new Math();

        while(true){
            System.out.println("1. Add\n2. Sub\n3. Mul\n4. Div\n5. Min\n6. Max\n7. Exit\nEnter your choice: ");
            int choice = sc.nextInt();
            if(choice == 7){
                break;
            }
            System.out.println("Enter two numbers: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
                    switch(choice){
                case 1:
                    System.out.println(obj.add(a, b));
                    break;
                case 2:
                    System.out.println(obj.sub(a, b));
                    break;
                case 3:
                    System.out.println(obj.mul(a, b));
                    break;
                case 4:
                    System.out.println(obj.div(a, b));
                    break;
                case 5:
                    System.out.println(obj.min(a, b));
                    break;
                case 6:
                    System.out.println(obj.max(a, b));
                    break;
            }
        }
        sc.close();
    }
}
