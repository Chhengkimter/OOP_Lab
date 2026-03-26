package Lab02;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==== Covid-19 Screen Health ===");
        System.out.println("01. Feeling feverish and/or having chills?");
        String ans1 = input.nextLine();
        System.out.println("02.  Has there been any use of fever reducing medication within the last 24 hours not due to another health condition?");
        String ans2 = input.nextLine();
        System.out.println("03.   A new cough that is not due to another health condition?");
        String ans3 = input.nextLine();        
        System.out.println("04.  New chills that are not due to another health condition? ");     
        String ans4 = input.nextLine();
        System.out.println("05.  A new sore throat that is not due to another health condition?");
        String ans5 = input.nextLine();
        System.out.println("06.  A new loss of taste or smell?");
        String ans6 = input.nextLine();
        System.out.println("07.  Have you had a positive test for the virus that causes COVID-19 disease within the past 10 days?");
        String ans7 = input.nextLine();
        System.out.println("08.   In the past 14 days, have you had close contact (within about 6 feet for 15 minutes or more) with someone with suspected or confirmed COVID-19?");
        String ans8 = input.nextLine();

        System.out.println("=".repeat(40));
        System.out.printf("| %-17s | %-16s |%n", "Questions", "Answers");
        System.out.println("=".repeat(40));
        System.out.format("| %-17s | %-16s |%n", "Q1", ans1);
        System.out.println("-".repeat(40));
        System.out.format("| %-17s | %-16s |%n", "Q2", ans2);
        System.out.println("-".repeat(40));
        System.out.format("| %-17s | %-16s |%n", "Q3", ans3);
        System.out.println("-".repeat(40));
        System.out.format("| %-17s | %-16s |%n", "Q4", ans4);
        System.out.println("-".repeat(40));
        System.out.format("| %-17s | %-16s |%n", "Q5", ans5);
        System.out.println("-".repeat(40));
        System.out.format("| %-17s | %-16s |%n", "Q6", ans6);
        System.out.println("-".repeat(40));
        System.out.format("| %-17s | %-16s |%n", "Q7", ans7);
        System.out.println("-".repeat(40));
        System.out.format("| %-17s | %-16s |%n", "Q8", ans8);
        System.out.println("=".repeat(40));
    }
}
