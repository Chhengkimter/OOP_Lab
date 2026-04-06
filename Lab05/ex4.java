package Lab05;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ex4 {

    static final String FILE_NAME = "data.txt";

    public static ArrayList<String> loadFromFile() {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            // File doesn't exist yet, start empty
        }
        return lines;
    }

    public static void saveToFile(ArrayList<String> lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public static void viewNote(ArrayList<String> lines) {
        System.out.println("==== View note ====");
        System.out.println("*".repeat(28));
        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + "| " + lines.get(i));
        }
        System.out.println("*".repeat(28));
    }

    public static void editNote(Scanner sc, ArrayList<String> lines) {
        System.out.println("==== Edit following note ====");
        System.out.println("*".repeat(28));
        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + "| " + lines.get(i));
        }
        System.out.println("*".repeat(28));

        System.out.println("1.  Append new line");
        System.out.println("2.  Update at line");
        System.out.println("3.  Delete line");
        System.out.print("Choose an opt: ");
        int opt = sc.nextInt();
        sc.nextLine();

        switch (opt) {
            case 1:
                int newLineNum = lines.size() + 1;
                System.out.print("Input a string for line #" + newLineNum + ": ");
                String newLine = sc.nextLine();
                lines.add(newLine);
                System.out.println("Line #" + newLineNum + " is appended to the note.");
                saveToFile(lines);
                break;
            case 2:
                System.out.print("Update line number: ");
                int updateIdx = sc.nextInt() - 1;
                sc.nextLine();
                if (updateIdx >= 0 && updateIdx < lines.size()) {
                    System.out.print("Input new string: ");
                    String updated = sc.nextLine();
                    lines.set(updateIdx, updated);
                    System.out.println("Line #" + (updateIdx + 1) + " is updated.");
                    saveToFile(lines);
                } else {
                    System.out.println("Invalid line number.");
                }
                break;
            case 3:
                System.out.print("Delete line number: ");
                int delIdx = sc.nextInt() - 1;
                sc.nextLine();
                if (delIdx >= 0 && delIdx < lines.size()) {
                    lines.remove(delIdx);
                    System.out.println("Line #" + (delIdx + 1) + " is deleted.");
                    saveToFile(lines);
                } else {
                    System.out.println("Invalid line number.");
                }
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lines = loadFromFile();

        while (true) {
            System.out.println("==== Menu ===");
            System.out.println("1.  View my note");
            System.out.println("2.  Edit");
            System.out.println("3.  Quit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    viewNote(lines);
                    break;
                case 2:
                    editNote(sc, lines);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}