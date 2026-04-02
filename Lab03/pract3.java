package Lab03;

import java.util.Scanner;

class Student {
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

public class pract3 {

    public static int deleteStudent(Scanner sc, Student[] students, int studentTotal) {
        int id = sc.nextInt();
        int indexToDelete = -1;

        for (int i = 0; i < studentTotal; i++) {
            if (id == students[i].getId()) {
                indexToDelete = i;
                break;
            }
        }

        if (indexToDelete == -1) {
            System.out.println("Student with ID " + id + " not found.");
            return studentTotal;
        }

        for (int i = indexToDelete; i < studentTotal - 1; i++) {
            students[i] = students[i + 1];
        }
        students[studentTotal - 1] = null;
        studentTotal--;

        System.out.println("Student deleted successfully.");
        return studentTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentTotal = 0;
        Student[] students = new Student[99];

        Student student1 = new Student();
        student1.setStudentInfo("John", 20, 1);
        Student student2 = new Student();
        student2.setStudentInfo("Jane", 21, 2);
        Student student3 = new Student();
        student3.setStudentInfo("Me", 25, 3);
        Student student4 = new Student();
        student4.setStudentInfo("NotMe", 19, 4);

        students[0] = student1;  
        studentTotal++;
        students[1] = student2;  
        studentTotal++;
        students[2] = student3;  
        studentTotal++;
        students[3] = student4;  
        studentTotal++;

        System.out.println("Would you like to delete a student? (y/n)");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter student ID to delete:");
            studentTotal = deleteStudent(sc, students, studentTotal);
        }

        System.out.println("\nCurrent students:");
        for (int i = 0; i < studentTotal; i++) {
            System.out.println(students[i].getStudentInfo());
        }

        sc.close();
    } //java -cp . Lab03.pract3
}