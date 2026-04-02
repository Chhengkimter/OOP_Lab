package Lab04;

import java.util.Scanner;
import java.util.ArrayList;
public class ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        int n = 1;
        while(true) {

            System.out.println("Student #" + n + ":");
            System.out.print("Id: ");
            id.add(input.nextInt());
            System.out.print("Name: ");
            name.add(input.next());
            System.out.print("Age: ");
            age.add(input.nextInt());
            System.out.println();

            System.out.print("Do you want to add more (y/n)? ");
            String choice = input.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
            n++;
        }

        System.out.println("=".repeat(53));
        System.out.printf("| %-5s | %-10s | %-20s | %-5s |%n", "No.", "ID", "Name", "Age");
        System.out.println("=".repeat(53));

        for (int i = 0; i < id.size(); i++) {
            System.out.printf("| %-5s | %-10s | %-20s | %-5s |%n", i + 1, id.get(i), name.get(i), age.get(i));
        }

        System.out.println("=".repeat(53));
        input.close();
    }
}
