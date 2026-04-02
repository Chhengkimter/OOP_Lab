package Lab04;

import java.util.Scanner;

public class ex2 {

    static void viewAllStudents(int n, int[] age, String[] name, int[] id) {

        if (n == 0) {
            System.out.println("There is no student in the database.");
            return;
        }

        System.out.println("=".repeat(53));
        System.out.printf("| %-5s | %-10s | %-20s | %-5s |%n", "No.", "ID", "Name", "Age");
        System.out.println("=".repeat(53));

        // Bug 2 fixed: was id[n], should be n
        for (int i = 0; i < n; i++) {
            System.out.printf("| %-5d | %-10d | %-20s | %-5d |%n", i + 1, id[i], name[i], age[i]);
        }

        System.out.println("=".repeat(53));
    }

    static int addNewStudent(Scanner input, int n, int[] age, String[] name, int[] id) {

        if (n == 100) {
            System.out.println("The database is full!");
            return n;
        }

        System.out.print("Enter student ID: ");
        id[n] = input.nextInt();

        input.nextLine();
        System.out.print("Enter student name: ");
        name[n] = input.nextLine();

        System.out.print("Enter student age: ");
        age[n] = input.nextInt();

        n++;
        System.out.println("Student added successfully.");
        return n;
    }

    static int deleteStudent(Scanner input, int n, int[] age, String[] name, int[] id) {
        System.out.print("Enter student ID: ");
        int studentID = input.nextInt();
        int indexToDelete = -1;
    
        for (int i = 0; i < n; i++) {
            if (id[i] == studentID) {
                indexToDelete = i;
                break;
            }
        }

        if (indexToDelete == -1) {
            System.out.println("Student is not found. Try again!");
            return n;
        }

        for (int i = indexToDelete; i < n - 1; i++) {
            id[i]   = id[i + 1];
            name[i] = name[i + 1];
            age[i]  = age[i + 1];
        }

        // Clear the last slot
        id[n - 1]   = 0;
        name[n - 1] = null;
        age[n - 1]  = 0;

        n--;
        System.out.println("Student deleted successfully.");
        return n;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maxSize = 100;
        int n = 0;
        int[]    age  = new int[maxSize];
        String[] name = new String[maxSize];
        int[]    id   = new int[maxSize];

        while (true) {
            System.out.println("\n==== Menu =====");
            System.out.println("1. View all students");
            System.out.println("2. Add a new student");
            System.out.println("3. Delete a student");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    viewAllStudents(n, age, name, id);
                    break;

                case 2:
                    n = addNewStudent(input, n, age, name, id);
                    break;

                case 3:
                    n = deleteStudent(input, n, age, name, id);
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    input.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}