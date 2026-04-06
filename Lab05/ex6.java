package Lab05;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ex6 {

    static final String USER_FILE = "user.txt";

    static class User {
        String firstName, lastName, username, email, password;

        public User(String firstName, String lastName, String username, String email, String password) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.username = username;
            this.email = email;
            this.password = password;
        }

        public String toFileString() {
            return firstName + "," + lastName + "," + username + "," + email + "," + password;
        }
    }

    static ArrayList<User> users = new ArrayList<>();

    public static void loadUsers() {
        try (BufferedReader r = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = r.readLine()) != null) {
                String[] p = line.split(",");
                if (p.length == 5)
                    users.add(new User(p[0], p[1], p[2], p[3], p[4]));
            }
        } catch (IOException ignored) {}
    }

    public static void saveUsers() {
        try (BufferedWriter w = new BufferedWriter(new FileWriter(USER_FILE))) {
            for (User u : users) {
                w.write(u.toFileString());
                w.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving: " + e.getMessage());
        }
    }

    public static void register(Scanner sc) {
        System.out.println("==== Register a new user ====");
        System.out.print("First Name: ");  String fn = sc.nextLine();
        System.out.print("Last Name: ");   String ln = sc.nextLine();
        System.out.print("Username: ");    String un = sc.nextLine();
        System.out.print("Email: ");       String em = sc.nextLine();
        System.out.print("Password: ");    String pw = sc.nextLine();

        users.add(new User(fn, ln, un, em, pw));
        saveUsers();
        System.out.println("You are successfully registered~");
    }

    public static void login(Scanner sc) {
        System.out.println("==== Login ====");

        while (true) {
            System.out.print("Email or Username: "); String input = sc.nextLine();
            System.out.print("Password: ");          String pw = sc.nextLine();

            User found = null;
            for (User u : users) {
                if ((u.username.equals(input) || u.email.equals(input)) && u.password.equals(pw)) {
                    found = u;
                    break;
                }
            }

            if (found == null) {
                System.out.println("User not found. Please try again");
            } else {
                System.out.println("=========== User Info ===========");
                System.out.println("Hi " + found.firstName + " " + found.lastName + ",");
                System.out.println("Your username is: " + found.username);
                System.out.println("Your email is: " + found.email);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loadUsers();

        while (true) {
            System.out.println("==== Menu ===");
            System.out.println("1.  Login");
            System.out.println("2.  Register");
            System.out.println("3.  Quit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1: login(sc);    break;
                case 2: register(sc); break;
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