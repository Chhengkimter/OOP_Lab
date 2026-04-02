package Lab04;

public class ex7 {

    public static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() { return x; }
        public double getY() { return y; }

        public String toString() {
            return "Point(" + x + ", " + y + ")";
        }

        public void display() {
            System.out.println("Point: (" + x + ", " + y + ")");
        }
    }

    public static class Line extends Point {
        private double length;

        public Line(double x, double y, double length) {
            super(x, y);
            this.length = length;
        }

        public double getLength() { return length; }

        @Override
        public void display() {
            System.out.println("Line: start=(" + getX() + ", " + getY() + "), length=" + length);
        }
    }

    public static class Triangle extends Line {
        private double base;
        private double height;

        public Triangle(double x, double y, double side, double base, double height) {
            super(x, y, side);
            this.base = base;
            this.height = height;
        }

        public double getArea() {
            return 0.5 * base * height;
        }

        public double getPerimeter() {
            return 3 * getLength();
        }

        @Override
        public void display() {
            System.out.println("Triangle: origin=(" + getX() + ", " + getY() + "), base=" + base + ", height=" + height);
            System.out.printf("  Area: %.2f, Perimeter: %.2f%n", getArea(), getPerimeter());
        }
    }

    public static class Rectangle extends Triangle {
        private double width;

        public Rectangle(double x, double y, double side, double base, double height, double width) {
            super(x, y, side, base, height);
            this.width = width;
        }

        public double getRectArea() {
            return getLength() * width;
        }

        public double getRectPerimeter() {
            return 2 * (getLength() + width);
        }

        @Override
        public void display() {
            System.out.println("Rectangle: origin=(" + getX() + ", " + getY() + "), length=" + getLength() + ", width=" + width);
            System.out.printf("  Area: %.2f, Perimeter: %.2f%n", getRectArea(), getRectPerimeter());
        }
    }

    public static class ITStudent {
        private int id;
        private String name;
        private int year;
        private String email;
        private double gpa;

        public ITStudent(int id, String name, int year, String email, double gpa) {
            this.id = id;
            this.name = name;
            this.year = year;
            this.email = email;
            this.gpa = gpa;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public int getYear() { return year; }
        public String getEmail() { return email; }
        public double getGpa() { return gpa; }

        public void display() {
            System.out.println("IT Student | ID: " + id + " | Name: " + name +
                    " | Year: " + year + " | Email: " + email + " | GPA: " + gpa);
        }
    }

    public static class ProgrammingStudent extends ITStudent {
        private String programmingLanguage;
        private String project;

        public ProgrammingStudent(int id, String name, int year, String email, double gpa,
                                  String programmingLanguage, String project) {
            super(id, name, year, email, gpa);
            this.programmingLanguage = programmingLanguage;
            this.project = project;
        }

        @Override
        public void display() {
            System.out.println("Programming Student | ID: " + getId() + " | Name: " + getName() +
                    " | Year: " + getYear() + " | Email: " + getEmail() +
                    " | GPA: " + getGpa() + " | Language: " + programmingLanguage +
                    " | Project: " + project);
        }
    }

    public static class TelecomStudent extends ITStudent {
        private String networkSpecialization;
        private String certifications;

        public TelecomStudent(int id, String name, int year, String email, double gpa,
                              String networkSpecialization, String certifications) {
            super(id, name, year, email, gpa);
            this.networkSpecialization = networkSpecialization;
            this.certifications = certifications;
        }

        @Override
        public void display() {
            System.out.println("Telecom Student | ID: " + getId() + " | Name: " + getName() +
                    " | Year: " + getYear() + " | Email: " + getEmail() +
                    " | GPA: " + getGpa() + " | Specialization: " + networkSpecialization +
                    " | Certifications: " + certifications);
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Part 1: Multiple Inheritance Chain ===");
        Point p = new Point(1, 2);
        p.display();

        Line l = new Line(0, 0, 5);
        l.display();

        Triangle t = new Triangle(0, 0, 4, 6, 3);
        t.display();

        Rectangle r = new Rectangle(0, 0, 5, 6, 3, 4);
        r.display();

        System.out.println("\n=== Part 2: Hierarchical Inheritance ===");
        ITStudent itStudent = new ITStudent(1, "Makara", 2, "makara@gmail.com", 3.5);
        itStudent.display();

        ProgrammingStudent progStudent = new ProgrammingStudent(2, "Minea", 3,
                "minea@gmail.com", 3.8, "Java", "Library System");
        progStudent.display();

        TelecomStudent telecomStudent = new TelecomStudent(3, "Dara", 2,
                "dara@gmail.com", 3.2, "5G Networks", "CCNA");
        telecomStudent.display();
    }
}