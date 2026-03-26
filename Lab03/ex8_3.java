package Lab03;
import java.util.Scanner;

class Author {
    private int authorId;
    private String name;
    private String nationality;
    private int birthYear;
    private String biography;

    public Author(int authorId, String name, String nationality, int birthYear, String biography) {
        this.authorId = authorId;
        this.name = name;
        this.nationality = nationality;
        this.birthYear = birthYear;
        this.biography = biography;
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getBiography() {
        return biography;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

}

class Book {
    private int bookId;
    private String title;
    private int isbn;
    private double price;
    private Author[] authors;

    public Book(int bookId, String title, int isbn, double price, Author[] authors) {
        this.bookId = bookId;
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.authors = authors;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public Author[] getAuthors() {
        return authors;
    }
    
}

public class ex8_3 {
    public static void main(String[] args) {
        Author author1 = new Author(1, "John Doe", "USA", 1990, "Biography of John Doe");
        Author author2 = new Author(2, "Jane Doe", "USA", 1991, "Biography of Jane Doe");
        
        Book Mstybloom = new Book(1, "Mstybloom", 43958373, 23.99, new Author[]{author1});
        Book Mstybloom2 = new Book(2, "Mstybloom2", 398853953, 29.99, new Author[]{author1, author2});
        Book Mstybloom3 = new Book(3, "Mstybloom3", 927458278, 31.99, new Author[]{author2});

        Book[] books = new Book[]{Mstybloom, Mstybloom2, Mstybloom3};

        for (Book book : books) {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Price: $" + book.getPrice());
            System.out.println("Authors:");
            for (Author author : book.getAuthors()) {
                System.out.println("- " + author.getName());
                System.out.println("  Nationality: " + author.getNationality());
                System.out.println("  Birth Year: " + author.getBirthYear());
                System.out.println("  Biography: " + author.getBiography());
                System.out.println();
            }
            System.out.println();
        }
    }
}
