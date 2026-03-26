package Lab03;

import java.util.Scanner;

public class ex3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 1;
        while (choice != 0) {
            displayMainMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    generalMenu();
                    break;
                case 2:
                    wifiMenu();
                    break;
                case 3:
                    bluetoothMenu();
                    break;
                case 4:
                    mobileDataMenu();
                    break;
                case 5:
                    hotspotMenu();
                    break;
                case 6:
                    notificationMenu();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    static void displayMainMenu() {
        System.out.println("\nPhone Setting:");
        System.out.printf("%-2d. %-25s %s%n", 1, "General", ">");
        System.out.printf("%-2d. %-25s %s%n", 2, "Wi-Fi", ">");
        System.out.printf("%-2d. %-25s %s%n", 3, "Bluetooth", ">");
        System.out.printf("%-2d. %-25s %s%n", 4, "Mobile Data", ">");
        System.out.printf("%-2d. %-25s %s%n", 5, "Hotspot", ">");
        System.out.printf("%-2d. %-25s %s%n", 6, "Notification", ">");
        System.out.printf("%-2d. %-25s %s%n", 0, "Exit", "");
        System.out.print("Enter choice: ");
    }

    static void generalMenu() {
        int choice = 1;
        while (choice != 0) {
            System.out.println("\nGeneral:");
            System.out.printf("%-2d. %-25s %s%n", 1, "About", ">");
            System.out.printf("%-2d. %-25s %s%n", 2, "Software Update", ">");
            System.out.printf("%-2d. %-25s %s%n", 3, "Storage", ">");
            System.out.printf("%-2d. %-25s %s%n", 0, "Back", "");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    aboutMenu();
                    break;
                case 2:
                    softwareUpdateMenu();
                    break;
                case 3:
                    storageMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    static void aboutMenu() {
        int choice = 1;
        while (choice != 0) {
            System.out.println("\nGeneral > About:");
            System.out.println("Name:                iPhone");
            System.out.println("Model:               IXs");
            System.out.println("Version:             18.5");
            System.out.printf("%-2d. %-25s %s%n", 0, "Back", "");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }

    static void softwareUpdateMenu() {
        int choice = 1;
        while (choice != 0) {
            System.out.println("\nGeneral > Software Update:");
            System.out.println("=".repeat(36));
            System.out.println("Software is up to date");
            System.out.println("=".repeat(36));
            System.out.printf("%-2d. %-25s %s%n", 0, "Back", "");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }

    static void storageMenu() {
        int choice = 1;
        while (choice != 0) {
            System.out.println("\nGeneral > Storage:");
            System.out.println("=".repeat(50));
            System.out.println("             Storage information");
            System.out.println("=".repeat(50));
            System.out.printf("%-2d. %-25s %s%n", 0, "Back", "");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }

    static void wifiMenu() {
        int choice = 1;
        while (choice != 0) {
            System.out.println("\nWi-Fi:");
            System.out.println("Status:                       On");
            System.out.println("Network:                      I-Coffee");
            System.out.printf("%-2d. %-25s %s%n", 1, "Other Networks", ">");
            System.out.printf("%-2d. %-25s %s%n", 0, "Back", "");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    otherNetworksMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    static void otherNetworksMenu() {
        int choice = 1;
        while (choice != 0) {
            System.out.println("\nWi-Fi > Other Networks:");
            System.out.printf("%-2d. %-25s %s%n", 1, "Bayoncoffee", "*****");
            System.out.printf("%-2d. %-25s %s%n", 2, "Angkorcoffee", "**");
            System.out.printf("%-2d. %-25s %s%n", 3, "Brown coffee", "****");
            System.out.printf("%-2d. %-25s %s%n", 4, "Koi", "*");
            System.out.printf("%-2d. %-25s %s%n", 0, "Back", "");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }

    static void bluetoothMenu() {
        int choice = 1;
        while (choice != 0) {
            System.out.println("\nBluetooth:");
            System.out.println("=".repeat(50));
            System.out.println("       The Feature is not available");
            System.out.println("=".repeat(50));
            System.out.printf("%-2d. %-25s %s%n", 0, "Back", "");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }

    static void mobileDataMenu() {
        int choice = 1;
        while (choice != 0) {
            System.out.println("\nMobile Data:");
            System.out.println("=".repeat(50));
            System.out.println("       The Feature is not available");
            System.out.println("=".repeat(50));
            System.out.printf("%-2d. %-25s %s%n", 0, "Back", "");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }

    static void hotspotMenu() {
        int choice = 1;
        while (choice != 0) {
            System.out.println("\nHotspot:");
            System.out.println("=".repeat(50));
            System.out.println("       The Feature is not available");
            System.out.println("=".repeat(50));
            System.out.printf("%-2d. %-25s %s%n", 0, "Back", "");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }

    static void notificationMenu() {
        int choice = 1;
        while (choice != 0) {
            System.out.println("\nNotification:");
            System.out.println("=".repeat(50));
            System.out.println("       The Feature is not available");
            System.out.println("=".repeat(50));
            System.out.printf("%-2d. %-25s %s%n", 0, "Back", "");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }
}