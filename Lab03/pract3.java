package Lab03;

import java.util.Scanner;

class Student {
    private String name;
    private int age;

    public void setStudentInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getStudentInfo() {
        return "Name: " + name + ", Age: " + age;
    }

    public void deleteStudent() {
        this.name = null;
        this.age = 0;
    }
}

public class pract3 {
    public static void main(String[] args) {
        int studentTotal = 0;
        Scanner sc = new Scanner(System.in);
        
        Student[] students = new Student[99];
        Student student1 = new Student();
        student1.setStudentInfo("John", 20);
        Student student2 = new Student();
        student2.setStudentInfo("Jane", 21);
        Student student3 = new Student();
        student3.setStudentInfo("Me", 25);
        Student student4 = new Student();
        student4.setStudentInfo("NotMe", 19);

        students[0] = student1;
        studentTotal++;
        students[1] = student2;
        studentTotal++;
        students[2] = student3;
        studentTotal++;
        students[3] = student4;
        studentTotal++;

        student2.deleteStudent();
        studentTotal--;

        for (int i = 0; i <= studentTotal; i++) {
            System.out.println(students[i].getStudentInfo());
        }
        
        sc.close();
    } //cd Lab; javac Lab03/pract3.java; java Lab03.pract3
}
