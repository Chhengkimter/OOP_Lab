package Lab05;
import java.util.Scanner;

public class ex2 {

    static class Student {
        private String name;
        private int age;
        private int id;

        public void setStudentInfo(String name, int age, int id) {
            this.name = name;
            this.age = age;
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public String getStudentInfo() {
            return "ID: " + id + ", Name: " + name + ", Age: " + age;
        }
    }

    public static int addNewStudents(Scanner input, Student[] students, int studentTotal) {
        if (studentTotal >= students.length) {
            System.out.println("The student database is full!");
            return studentTotal;
        }

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student age: ");
        int age = input.nextInt();

        System.out.print("Enter student ID: ");
        int id = input.nextInt();
        input.nextLine();

        Student newStudent = new Student();
        newStudent.setStudentInfo(name, age, id);
        students[studentTotal] = newStudent;
        studentTotal++;

        System.out.println("Student added successfully.");
        return studentTotal;
    }

    public static int deleteMultipleStudents(Scanner input, Student[] students, int studentTotal) {
        
        System.out.println("=".repeat(51));
        System.out.printf("| No        | ID        | Name              | Age |%n");
        System.out.println("=".repeat(51));
        for (int i = 0; i < studentTotal; i++) {
            System.out.printf("| %d         | %-9d | %-17s | %d  |%n", i + 1, students[i].getId(), students[i].name, students[i].age);
        }
        System.out.println("=".repeat(51));
        
        System.out.print("How many students to delete? ");
        int count = input.nextInt();
        input.nextLine();

        for (int d = 0; d < count; d++) {
            System.out.print("Enter ID of student to delete: ");
            int id = input.nextInt();
            input.nextLine();

            int indexToDelete = -1;
            for (int i = 0; i < studentTotal; i++) {
                if (students[i].getId() == id) {
                    indexToDelete = i;
                    break;
                }
            }

            if (indexToDelete == -1) {
                System.out.println("Student with ID " + id + " not found.");
                continue;
            }

            for (int i = indexToDelete; i < studentTotal - 1; i++) {
                students[i] = students[i + 1];
            }
            students[studentTotal - 1] = null;
            studentTotal--;

            System.out.println("Student with ID " + id + " deleted.");
        }

        return studentTotal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[100];
        int studentTotal = 0;

        while(true) {
            System.out.println("==== Menu ====");
            System.out.println("1. Add new students");
            System.out.println("2. Delete multiple students");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    studentTotal = addNewStudents(input, students, studentTotal);
                    break;
                case 2:
                    studentTotal = deleteMultipleStudents(input, students, studentTotal);
                    break;
                case 3:
                    System.out.println("ByeBye!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}