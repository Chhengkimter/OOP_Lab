package Lab03;
import java.util.ArrayList;
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

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        
        Student student1 = new Student();
        student1.setStudentInfo("John", 20);
        
        Student student2 = new Student();
        student2.setStudentInfo("Jane", 21);
        
        Student student3 = new Student();
        student3.setStudentInfo("Me", 25);
        
        Student student4 = new Student();
        student4.setStudentInfo("NotMe", 19);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println("Before deletion:");
        for (Student s : students) {
            System.out.println(s.getStudentInfo());
        }

        students.remove(1);

        System.out.println("\nAfter deletion:");
        for (Student s : students) {
            System.out.println(s.getStudentInfo());
        }
    }//cd Lab; javac Lab03/StudentManager.java; java Lab03.StudentManager
}