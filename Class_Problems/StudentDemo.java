class Student {
    String name;
    double attendance;

    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount;

    Student(String name, double attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Attendance: " + attendance + "%");
    }

    static void printCollegeInfo() {
        System.out.println("\nCollege: " + collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Ravi", 90);
        Student student2 = new Student("Anitha", 85);

        student1.display();
        System.out.println();
        student2.display();

        Student.printCollegeInfo();
    }
}