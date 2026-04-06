package Lab05;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;

public class ex01 {

    public static void currentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Current date and time: " + formattedDateTime);
    }

    public static void calculateDaysBetween(Scanner sc) {
        System.out.print("Enter the first date (dd-MM-yyyy): ");
        String date1Str = sc.nextLine();
        System.out.print("Enter the second date (dd-MM-yyyy): ");
        String date2Str = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse(date1Str, formatter);
        LocalDate date2 = LocalDate.parse(date2Str, formatter);

        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Days between: " + Math.abs(daysBetween));
    }

    public static void findDayOfWeek(Scanner sc) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        boolean correct = false;
        
        while(!correct) {
            System.out.print("Enter a date (dd-MM-yyyy): ");
            String dateStr = sc.nextLine().trim(); 

            try {
                LocalDate date = LocalDate.parse(dateStr, formatter);
                String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
                System.out.println("The day of the week is: " + dayOfWeek);
                correct = true;
                
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use dd-MM-yyyy.");
                System.out.println("Error detail: " + e.getMessage()); 
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.println("==== Menu ====");
            System.out.println("1. Current date and time");
            System.out.println("2. Calculate days between two dates");
            System.out.println("3. Find the day of the week");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    currentDateTime();
                    break;
                case 2:
                    calculateDaysBetween(sc);
                    break;
                case 3:
                    findDayOfWeek(sc);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }
    }
}
