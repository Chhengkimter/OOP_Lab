package Lab05;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ex5 {

    // Base class
    static abstract class Person {
        protected String firstName, lastName, sex, email;

        public Person(String firstName, String lastName, String sex, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.email = email;
        }

        public abstract String toFileString();
        public abstract String toDisplayString();
    }

    static class Teacher extends Person {
        private String subjects, salary;

        public Teacher(String firstName, String lastName, String sex, String email,
                       String subjects, String salary) {
            super(firstName, lastName, sex, email);
            this.subjects = subjects;
            this.salary = salary;
        }

        @Override
        public String toFileString() {
            return firstName + "," + lastName + "," + sex + "," + email + "," + subjects + "," + salary;
        }

        @Override
        public String toDisplayString() {
            return "[" + firstName + " " + lastName + "][" + sex + "][" + email + "][" + subjects + "][" + salary + "$]";
        }
    }

    static class Student extends Person {
        private String year, major;

        public Student(String firstName, String lastName, String sex, String email,
                       String year, String major) {
            super(firstName, lastName, sex, email);
            this.year = year;
            this.major = major;
        }

        @Override
        public String toFileString() {
            return firstName + "," + lastName + "," + sex + "," + email + "," + year + "," + major;
        }

        @Override
        public String toDisplayString() {
            return "[" + firstName + " " + lastName + "][" + sex + "][" + email + "][" + year + "][" + major + "]";
        }
    }

    static class SecurityGuard extends Person {
        private String role;

        public SecurityGuard(String firstName, String lastName, String sex, String email, String role) {
            super(firstName, lastName, sex, email);
            this.role = role;
        }

        @Override
        public String toFileString() {
            return firstName + "," + lastName + "," + sex + "," + email + "," + role;
        }

        @Override
        public String toDisplayString() {
            return "[" + firstName + " " + lastName + "][" + sex + "][" + email + "][" + role + "]";
        }
    }

    static final String TEACHER_FILE = "teacher.txt";
    static final String STUDENT_FILE = "student.txt";
    static final String GUARD_FILE = "securityguard.txt";

    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<SecurityGuard> guards = new ArrayList<>();

    public static void loadAll() {
        // Load teachers
        try (BufferedReader r = new BufferedReader(new FileReader(TEACHER_FILE))) {
            String line;
            while ((line = r.readLine()) != null) {
                String[] p = line.split(",");
                if (p.length == 6)
                    teachers.add(new Teacher(p[0], p[1], p[2], p[3], p[4], p[5]));
            }
        } catch (IOException ignored) {}

        // Load students
        try (BufferedReader r = new BufferedReader(new FileReader(STUDENT_FILE))) {
            String line;
            while ((line = r.readLine()) != null) {
                String[] p = line.split(",");
                if (p.length == 6)
                    students.add(new Student(p[0], p[1], p[2], p[3], p[4], p[5]));
            }
        } catch (IOException ignored) {}

        // Load guards
        try (BufferedReader r = new BufferedReader(new FileReader(GUARD_FILE))) {
            String line;
            while ((line = r.readLine()) != null) {
                String[] p = line.split(",");
                if (p.length == 5)
                    guards.add(new SecurityGuard(p[0], p[1], p[2], p[3], p[4]));
            }
        } catch (IOException ignored) {}
    }

    public static <T extends Person> void saveList(ArrayList<T> list, String filename) {
        try (BufferedWriter w = new BufferedWriter(new FileWriter(filename))) {
            for (T item : list) {
                w.write(item.toFileString());
                w.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving: " + e.getMessage());
        }
    }

    public static void addNew(Scanner sc) {
        System.out.println("==== Add new resource ====");
        System.out.println("1. Teacher");
        System.out.println("2. Student");
        System.out.println("3. Security guard");
        System.out.print("Choose an opt: ");
        int opt = sc.nextInt(); sc.nextLine();

        System.out.print("First Name: "); String fn = sc.nextLine();
        System.out.print("Last Name: ");  String ln = sc.nextLine();
        System.out.print("Sex: ");        String sex = sc.nextLine();
        System.out.print("Email: ");      String email = sc.nextLine();

        switch (opt) {
            case 1:
                System.out.print("Subject: ");  String subj = sc.nextLine();
                System.out.print("Salary: ");   String sal = sc.nextLine();
                teachers.add(new Teacher(fn, ln, sex, email, subj, sal));
                saveList(teachers, TEACHER_FILE);
                break;
            case 2:
                System.out.print("Year: ");   String yr = sc.nextLine();
                System.out.print("Major: ");  String maj = sc.nextLine();
                students.add(new Student(fn, ln, sex, email, yr, maj));
                saveList(students, STUDENT_FILE);
                break;
            case 3:
                System.out.print("Role: ");  String role = sc.nextLine();
                guards.add(new SecurityGuard(fn, ln, sex, email, role));
                saveList(guards, GUARD_FILE);
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    public static void viewAll() {
        System.out.println("==== Teacher ====");
        for (int i = 0; i < teachers.size(); i++)
            System.out.println((i + 1) + ". " + teachers.get(i).toDisplayString());

        System.out.println("=========== Student ===========");
        for (int i = 0; i < students.size(); i++)
            System.out.println((i + 1) + ". " + students.get(i).toDisplayString());

        System.out.println("=========== Security guard ===========");
        for (int i = 0; i < guards.size(); i++)
            System.out.println((i + 1) + ". " + guards.get(i).toDisplayString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loadAll();

        while (true) {
            System.out.println("==== Menu ===");
            System.out.println("1.  View all");
            System.out.println("2.  Add new");
            System.out.println("3.  Quit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1: viewAll(); break;
                case 2: addNew(sc); break;
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