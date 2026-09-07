class SrmStudent {

    static {
        System.out.println("College info loaded");
    }

    String name;

    SrmStudent(String name) {
        this.name = name;
    }

    void printRecord() {
        System.out.println("Student record created: " + name);
    }
}

public class M4 {
    public static void main(String[] args) {
        String[] names = { "Ravi", "Meera", "Karthik", "Divya", "Anitha" };

        for (String name : names) {
            SrmStudent student = new SrmStudent(name);
            student.printRecord();
        }
    }
}