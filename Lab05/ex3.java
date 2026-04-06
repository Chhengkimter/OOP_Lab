package Lab05;
import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {

    // Base class
    static abstract class Shape {
        public abstract void display(int index);
    }

    static class Line extends Shape {
        private int length;

        public Line(int length) {
            this.length = length;
        }

        @Override
        public void display(int index) {
            System.out.println(index + ". length: " + length);
            for (int i = 0; i < length; i++) System.out.print("_");
            System.out.println();
        }
    }

    static class Rectangle extends Shape {
        private int width, height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public void display(int index) {
            System.out.println(index + ". Width: " + width + ", Height: " + height);
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    static class Triangle extends Shape {
        private int height;

        public Triangle(int height) {
            this.height = height;
        }

        @Override
        public void display(int index) {
            System.out.println(index + ". height: " + height);
            for (int i = 1; i <= height; i++) {
                for (int j = 0; j < i; j++) System.out.print("*");
                System.out.println();
            }
        }
    }

    static ArrayList<Line> lines = new ArrayList<>();
    static ArrayList<Rectangle> rectangles = new ArrayList<>();
    static ArrayList<Triangle> triangles = new ArrayList<>();

    public static void addNewShape(Scanner sc) {
        System.out.println("==== Add new shape ====");
        System.out.println("Select a shape:");
        System.out.println("1.  Line");
        System.out.println("2.  Rectangle");
        System.out.println("3.  Triangle");
        System.out.print("Choose an opt: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Input length: ");
                int len = sc.nextInt(); sc.nextLine();
                lines.add(new Line(len));
                break;
            case 2:
                System.out.print("Input width: ");
                int w = sc.nextInt(); sc.nextLine();
                System.out.print("Input height: ");
                int h = sc.nextInt(); sc.nextLine();
                rectangles.add(new Rectangle(w, h));
                break;
            case 3:
                System.out.print("Input height: ");
                int th = sc.nextInt(); sc.nextLine();
                triangles.add(new Triangle(th));
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==== Menu ===");
            System.out.println("1.  View all lines");
            System.out.println("2.  View all rectangles");
            System.out.println("3.  View all triangles");
            System.out.println("4.  Add a new shape");
            System.out.println("5.  Quit");
            System.out.print("Choose an opt: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("==== List all lines ====");
                    for (int i = 0; i < lines.size(); i++) lines.get(i).display(i + 1);
                    break;
                case 2:
                    System.out.println("==== List all rectangles ====");
                    for (int i = 0; i < rectangles.size(); i++) rectangles.get(i).display(i + 1);
                    break;
                case 3:
                    System.out.println("==== List all triangles ====");
                    for (int i = 0; i < triangles.size(); i++) triangles.get(i).display(i + 1);
                    break;
                case 4:
                    addNewShape(sc);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}