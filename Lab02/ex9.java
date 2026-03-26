package Lab02;
import java.util.Scanner;
import java.util.ArrayList;

public class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        int i = 0;
        while (true) {
            System.out.print("Input value in Array at index " + i + ": ");
            num.add(input.nextInt());
            i++;

            System.out.print("Do you want to add more (y/n)? ");
            String choice = input.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }

        int max = num.get(0);
        for (int j = 1; j < num.size(); j++) {
            if (num.get(j) > max) {
                max = num.get(j);
            }
        }
        System.out.println("The largest number in Array is: " + max);
    }
}