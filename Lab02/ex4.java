package Lab02;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        System.out.println("Input number of seconds: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int hr = input / 3600;
        int min = (input % 3600) / 60;
        int sec = input % 60;

        System.out.println(hr + ":" + min + ":" + sec);
    }
}
