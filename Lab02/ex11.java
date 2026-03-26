package Lab02;

public class ex11 {

    public static class Student {
        int id;
        String name;
        char gender;
        int age;
        double score;
    }
    public static void main(String[] args) {
        
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();

        stu1.id = 1;
        stu1.name = "Alice";
        stu1.gender = 'F';
        stu1.age = 20;
        stu1.score = 85.5;

        stu2.id = 2;
        stu2.name = "Bob";
        stu3.gender = 'M';
        stu2.age = 22;
        stu2.score = 90.0;

        stu3.id = 3;
        stu3.name = "Charlie";
        stu3.gender = 'M';
        stu3.age = 19;
        stu3.score = 78.5;

        Student[] students = {stu1, stu2, stu3};

        for (Student stu : students) {
            System.out.println("ID: " + stu.id);
            System.out.println("Name: " + stu.name);
            System.out.println("Gender: " + stu.gender);
            System.out.println("Age: " + stu.age);
            System.out.println("Score: " + stu.score);
            System.out.println("------------------");
        }
    }
}
