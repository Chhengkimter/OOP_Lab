package Lab04;

import java.util.Scanner;

public class ex3 {

    // Bug 1 fixed: made Book a static inner class so it can be used in static methods
    // Bug 4 note: Book class kept but parallel arrays are used for consistency with ex2 style
    public static class Book {
        private int bookId;
        private String title;
        private long isbn;      
        private double price;
        private String authors;

        public Book(int bookId, String title, long isbn, double price, String authors) {
            this.bookId = bookId;
            this.title = title;
            this.isbn = isbn;
            this.price = price;
            this.authors = authors;
        }

        public int getBookId() {
            return bookId;
        }
    }

    // Bug 2 fixed: return type changed from void to int (was called as n = viewAllBooks(...))
    public static int viewAllBooks(Scanner input, int n, int[] bookId, String[] title, long[] isbn, double[] price, String[] authors) {

        if (n == 0) {
            System.out.println("There is no book in the database.");
            return n;
        }

        System.out.println("=".repeat(107));
        System.out.printf("| %-5s | %-10s | %-30s | %-13s | %-10s | %-20s |%n",
                "No.", "BookId", "Title", "ISBN", "Price", "Authors");
        System.out.println("=".repeat(107));

        for (int i = 0; i < n; i++) {
            System.out.printf("| %-5d | %-10d | %-30s | %-13d | %-10.2f | %-20s |%n",
                    i + 1, bookId[i], title[i], isbn[i], price[i], authors[i]);
        }

        System.out.println("=".repeat(107));
        return n;
    }

    public static int addNewBook(Scanner input, int n, int[] bookId, String[] title, long[] isbn, double[] price, String[] authors) {

        if (n == 100) {
            System.out.println("The database is full!");
            return n;
        }

        System.out.print("Enter book ID: ");
        bookId[n] = input.nextInt();

        input.nextLine();
        System.out.print("Enter book title: ");
        title[n] = input.nextLine();

        System.out.print("Enter book ISBN: ");
        isbn[n] = input.nextLong(); 

        System.out.print("Enter book price: ");
        price[n] = input.nextDouble();

        input.nextLine();
        System.out.print("Enter book authors (comma separated): ");
        authors[n] = input.nextLine();

        n++;
        System.out.println("Book added successfully.");
        return n;
    }

    public static int updateBook(Scanner input, int n, int[] bookId, String[] title, long[] isbn, double[] price, String[] authors) {

        System.out.print("Enter book ID to update: ");
        int idToUpdate = input.nextInt();
        int indexToUpdate = -1;

        for (int i = 0; i < n; i++) {
            if (bookId[i] == idToUpdate) {
                indexToUpdate = i;
                break;
            }
        }

        if (indexToUpdate == -1) {
            System.out.println("Book with ID " + idToUpdate + " not found.");
            return n;
        }

        input.nextLine();
        System.out.print("Enter new book title: ");
        title[indexToUpdate] = input.nextLine();

        System.out.print("Enter new book ISBN: ");
        isbn[indexToUpdate] = input.nextLong(); 

        System.out.print("Enter new book price: ");
        price[indexToUpdate] = input.nextDouble();

        input.nextLine();
        System.out.print("Enter new book authors (comma separated): ");
        authors[indexToUpdate] = input.nextLine();

        System.out.println("Book updated successfully.");
        return n;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maxSize = 100;
        int n = 0;

        int[]    bookId  = new int[maxSize];
        String[] title   = new String[maxSize];
        long[]   isbn    = new long[maxSize]; 
        double[] price   = new double[maxSize];
        String[] authors = new String[maxSize];

        while (true) {
            System.out.println("\n==== Menu =====");
            System.out.println("1. View all books");
            System.out.println("2. Add new book");
            System.out.println("3. Update a book");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    n = viewAllBooks(input, n, bookId, title, isbn, price, authors);
                    break;
                case 2:
                    n = addNewBook(input, n, bookId, title, isbn, price, authors);
                    break;
                case 3:
                    n = updateBook(input, n, bookId, title, isbn, price, authors);
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