package Lab04;

public class ex6 {

    public static class Student {
        private int id;
        private String name;
        private String gender;
        private int age;
        private String major;
        Student next;

        public Student(int id, String name, String gender, int age, String major) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.major = major;
            this.next = null;
        }

        public String getName() { return name; }
    }

    public static class StudentList {
        private Student head;
        private int size;

        public StudentList() {
            this.head = null;
            this.size = 0;
        }

        public void add(Student newStudent) {
            if (head == null) {
                head = newStudent;
            } else {
                Student current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newStudent;
            }
            size++;
        }

        public void remove(int index) {
            if (index < 0 || index >= size) {
                System.out.println("Index is out of range");
                return;
            }
            if (index == 0) {
                head = head.next;
            } else {
                Student current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
            }
            size--;
        }

        public void removeLast() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            if (head.next == null) {
                head = null;
            } else {
                Student current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
            size--;
        }

        public void clear() {
            head = null;
            size = 0;
        }

        public void display() {
            if (head == null) {
                System.out.println("Array is emply");
                return;
            }
            Student current = head;
            while (current != null) {
                System.out.println(current.getName());
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {

        StudentList myArr = new StudentList();

        System.out.println("==> Add");
        myArr.add(new Student(1, "Makara", "Male", 20, "CS"));
        myArr.add(new Student(2, "Kompheak", "Male", 21, "CS"));
        myArr.display();

        System.out.println("==> Remove at last");
        myArr.removeLast();
        myArr.add(new Student(3, "Minea", "Female", 19, "CS"));
        myArr.add(new Student(4, "Mehsa", "Female", 20, "CS"));
        myArr.display();

        System.out.println("==> Remove at larger index");
        myArr.remove(10);

        System.out.println("==> Clear all element");
        myArr.clear();
        myArr.display();
    }
}