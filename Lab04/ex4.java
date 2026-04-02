package Lab04;

import java.util.Scanner;

public class ex4 {

    public static int viewAllVideos(Scanner input, int n, int[] videoId, String[] title, String[] uploader, double[] length, String[] type) {

        if (n == 0) {
            System.out.println("There is no video in the database.");
            return n;
        }

        System.out.println("=".repeat(97));
        System.out.printf("| %-5s | %-10s | %-25s | %-20s | %-10s | %-10s |%n",
                "No.", "VideoId", "Title", "Uploader", "Length(min)", "Type");
        System.out.println("=".repeat(97));

        for (int i = 0; i < n; i++) {
            System.out.printf("| %-5d | %-10d | %-25s | %-20s | %-11.2f | %-10s |%n",
                    i + 1, videoId[i], title[i], uploader[i], length[i], type[i]);
        }

        System.out.println("=".repeat(97));
        return n;
    }

    public static int addNewVideo(Scanner input, int n, int[] videoId, String[] title, String[] uploader, double[] length, String[] type) {

        if (n == 100) {
            System.out.println("The database is full!");
            return n;
        }

        System.out.print("Enter video ID: ");
        videoId[n] = input.nextInt();

        input.nextLine();
        System.out.print("Enter video title: ");
        title[n] = input.nextLine();

        System.out.print("Enter uploader name: ");
        uploader[n] = input.nextLine();

        System.out.print("Enter video length (minutes): ");
        length[n] = input.nextDouble();

        input.nextLine();
        System.out.print("Enter video type (e.g. Music, Vlog, Tutorial): ");
        type[n] = input.nextLine();

        n++;
        System.out.println("Video added successfully.");
        return n;
    }

    public static void searchVideo(Scanner input, int n, int[] videoId, String[] title, String[] uploader, double[] length, String[] type) {

        boolean searching = true;

        while (searching) {
            System.out.print("Input title: ");
            String keyword = input.nextLine().toLowerCase();

            int count = 0;
            int[] found = new int[n];

            for (int i = 0; i < n; i++) {
                if (title[i].toLowerCase().contains(keyword)) {
                    found[count++] = i;
                }
            }

            if (count == 0) {
                System.out.println("0 video found. Try again");
            } else {
                System.out.println(count + " video" + (count > 1 ? "s" : "") + " found:");
                for (int i = 0; i < count; i++) {
                    int idx = found[i];
                    System.out.println((i + 1) + ". " + title[idx] + " - " + uploader[idx]);
                }
                searching = false;
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maxSize = 100;
        int n = 0;

        int[]    videoId  = new int[maxSize];
        String[] title    = new String[maxSize];
        String[] uploader = new String[maxSize];
        double[] length   = new double[maxSize];
        String[] type     = new String[maxSize];

        while (true) {
            System.out.println("\n==== Menu ===");
            System.out.println("1. Search");
            System.out.println("2. View all videos");
            System.out.println("3. Add a new video");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    searchVideo(input, n, videoId, title, uploader, length, type);
                    break;
                case 2:
                    n = viewAllVideos(input, n, videoId, title, uploader, length, type);
                    break;
                case 3:
                    n = addNewVideo(input, n, videoId, title, uploader, length, type);
                    break;
                case 4:
                    System.out.println("ByeBye!");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}