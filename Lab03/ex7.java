package Lab03;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    void setValues(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class ex7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        
        while(true){
            System.out.println("===== Menu ====");
            System.out.println("1. Create a student");
            System.out.println("2. List students");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");
    
            int choice = sc.nextInt();
            if(choice == 3){
                break;
            }   
            if(choice == 1){
                while(true){
                    System.out.print("Enter student ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter student name: ");
                    String name = sc.next();
                    System.out.print("Enter student age: ");
                    int age = sc.nextInt();

                    Student stu = new Student();
                    stu.setValues(id, name, age);
                    students.add(stu);
                    System.out.print("Do you want to add more (y/n)? ");
                    String choice1 = sc.next();
                    if (!choice1.equalsIgnoreCase("y")) {
                        break;
                    }
                }
            }
            if(choice == 2){
                System.out.println("=".repeat(53));
                System.out.printf("| %-5s | %-10s | %-20s | %-5s |%n", "No.", "ID", "Name", "Age");
                System.out.println("=".repeat(53));

                for (int i = 0; i < students.size(); i++) {
                    System.out.printf("| %-5s | %-10s | %-20s | %-5s |%n", i + 1, students.get(i).id, students.get(i).name, students.get(i).age);
                }
                System.out.println("=".repeat(53));
            } 
        }

        sc.close();
    }    
}
